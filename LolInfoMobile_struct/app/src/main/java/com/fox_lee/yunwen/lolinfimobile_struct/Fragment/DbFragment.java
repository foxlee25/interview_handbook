package com.fox_lee.yunwen.lolinfimobile_struct.Fragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.fox_lee.yunwen.lolinfimobile_struct.Utility.Algorithm;
import com.fox_lee.yunwen.lolinfimobile_struct.Utility.AlgorithmRepo;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Yunwen on 2/24/2016.
 */
public class DbFragment extends ListFragment implements View.OnClickListener{
    private String var;
    private Button btnAdd,btnGetAll, btnDelete;
    private TextView student_Id;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_db, container, false);
        Log.d("Fragment", "Db Fragment Started");
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnAdd = (Button) view.findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);

        btnDelete = (Button) view.findViewById(R.id.btnDelete);
        btnDelete.setOnClickListener(this);

        btnGetAll = (Button) view.findViewById(R.id.btnGetAll);
        btnGetAll.setOnClickListener(this);
    }

    public void onClick(View v){
        int _algorithm_id =0;
        if (v == v.findViewById(R.id.btnAdd)){
            //when click Add, go to the next activity; but we want to add a row ("title","content")

            Log.d("DbFragment","btn add clicked");

            AlgorithmRepo repo = new AlgorithmRepo(v.getContext());
            Algorithm algorithm = new Algorithm();
            algorithm = repo.getColumnById(_algorithm_id);
            Log.d("MainActivity","The id is: " + _algorithm_id);

            algorithm.age = 25;
            algorithm.content = "Email";
            algorithm.topic = "Name";
            algorithm.algorithm_ID=_algorithm_id;

            if(_algorithm_id==0){
                _algorithm_id=repo.insert(algorithm);
                Toast.makeText(v.getContext(), "New Content Insert", Toast.LENGTH_SHORT).show();
            }else{
                repo.update(algorithm);
                Toast.makeText(v.getContext(),"Content Record updated",Toast.LENGTH_SHORT).show();
            }

        }else if (v== v.findViewById(R.id.btnDelete)){

            AlgorithmRepo repo = new AlgorithmRepo(v.getContext());
            Algorithm algorithm = new Algorithm();
            //algorithm = repo.getColumnById(_student_id);
            algorithm = repo.getColumnByTopic("Name");
            repo.delete(algorithm.algorithm_ID);
            Toast.makeText(v.getContext(), "Record Deleted", Toast.LENGTH_SHORT);
        }else {
            // button list
            Log.d("DbFragment","btn list all clicked");
            AlgorithmRepo repo = new AlgorithmRepo(v.getContext());
            Algorithm algorithm = new Algorithm();
            Log.d("MainActivity","The id is: " + _algorithm_id);
            algorithm = repo.getColumnById(_algorithm_id);
            ArrayList<HashMap<String, String>> algorithmList =  repo.getAlgorithmList();

            if(algorithmList.size()!=0) {
                ListView lv = getListView();
                ListAdapter adapter = new SimpleAdapter( v.getContext(),algorithmList, R.layout.view_db_entry, new String[] { "id","topic"}, new int[] {R.id.student_Id, R.id.student_name});
                setListAdapter(adapter);
            }else{
                Toast.makeText(v.getContext(), "No Content!", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
