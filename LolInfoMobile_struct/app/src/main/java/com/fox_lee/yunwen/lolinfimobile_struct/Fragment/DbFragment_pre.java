//package com.fox_lee.yunwen.lolinfimobile_struct.Fragment;
//
//import android.app.ListFragment;
//import android.os.Bundle;
//import android.os.Handler;
//import android.support.annotation.Nullable;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.AdapterView;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ListAdapter;
//import android.widget.ListView;
//import android.widget.SimpleAdapter;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import com.fox_lee.yunwen.lolinfimobile_struct.Activity.MainActivity;
//import com.fox_lee.yunwen.lolinfimobile_struct.Utility.Algorithm;
//import com.fox_lee.yunwen.lolinfimobile_struct.Utility.AlgorithmRepo;
//import com.fox_lee.yunwen.lolinfomobile_struct.R;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
///**
// * Created by Yunwen on 2/24/2016.
// */
//public class DbFragment extends ListFragment implements View.OnClickListener{
//    private String var;
//    private Button btnAdd,btnGetAll, btnDelete, btnGoto;
//    private EditText editDelete;
//    private TextView student_Id;
//    boolean deleteClick = false;
//    boolean gotoClick = false;
//
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_db, container, false);
//        return view;
//    }
//
//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//
////        btnAdd = (Button) view.findViewById(R.id.btnAdd);
////        btnAdd.setOnClickListener(this);
////        editDelete = (EditText) view.findViewById(R.id.edit_delete_db);
////
////        btnDelete = (Button) view.findViewById(R.id.btnDelete);
////        btnDelete.setOnClickListener(this);
////
////        btnGoto = (Button) view.findViewById(R.id.btnGoto);
////        btnGoto.setOnClickListener(this);
//
//        btnGetAll = (Button) view.findViewById(R.id.btnGetAll);
//        btnGetAll.setOnClickListener(this);
//        btnGetAll.callOnClick();
//    }
//
//    public void onClick(final View v){
//        int _algorithm_id =0;
////        if (v == v.findViewById(R.id.btnAdd)){
////            //when click Add, go to the next activity; but we want to add a row ("title","content")
////            Log.d("DbFragment","btn add clicked");
////            AlgorithmRepo repo = new AlgorithmRepo(v.getContext());
////            Algorithm algorithm = new Algorithm();
////            algorithm = repo.getColumnById(_algorithm_id);
////            Log.d("MainActivity","The id is: " + _algorithm_id);
////            algorithm.age = 25;
////            algorithm.content = "Email";
////            algorithm.topic = "Name";
////            algorithm.algorithm_ID=_algorithm_id;
////            if(_algorithm_id==0){
////                _algorithm_id=repo.insert(algorithm);
////                Toast.makeText(v.getContext(), "New Content Insert", Toast.LENGTH_SHORT).show();
////            }else{
////                repo.update(algorithm);
////                Toast.makeText(v.getContext(),"Content Record updated",Toast.LENGTH_SHORT).show();
////            }
////        }else
////        if (v== v.findViewById(R.id.btnDelete)){
////            //button delete
////            AlgorithmRepo repo = new AlgorithmRepo(v.getContext());
////            Algorithm algorithm = new Algorithm();
////            //algorithm = repo.getColumnById(_student_id);
////            String dataContent = editDelete.getText().toString();
////            algorithm = repo.getColumnByTopic(dataContent);
////            repo.delete(algorithm.algorithm_ID);
////            gotoClick = false;
////            deleteClick = true;
////            Toast.makeText(getActivity(), "Quickly click content to delete", Toast.LENGTH_SHORT).show();
////        } else if (v== v.findViewById(R.id.btnGoto)){
////            //button goto
////            deleteClick = false;
////            gotoClick = true;
////            Toast.makeText(getActivity(), "Quickly topic you want to go", Toast.LENGTH_SHORT).show();
////        }
//    if (v == v.findViewById(R.id.btnGetAll)){
//            // button list
//            AlgorithmRepo repo = new AlgorithmRepo(v.getContext());
//            Algorithm algorithm = new Algorithm();
//            Log.d("MainActivity","The id is: " + _algorithm_id);
//            algorithm = repo.getColumnById(_algorithm_id);
//
//            //ArrayList<HashMap<String, String>> algorithmList =  repo.getAlgorithmList();
//            ArrayList<HashMap<String, String>> algorithmList =  repo.getAlgorithmList();
//
//        if(algorithmList.size()!=0) {
//                ListView lv = getListView();
//                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                        String dataContent = ((TextView) view.findViewById(R.id.algorithm_name)).getText().toString();
//                        AlgorithmRepo repo = new AlgorithmRepo(getActivity());
////                        if (deleteClick) {
////                            //do delete
////                            Algorithm algorithm = new Algorithm();
////                            algorithm = repo.getColumnByTopic(dataContent);
////                            repo.delete(algorithm.algorithm_ID);
////                            Toast.makeText(getActivity(), "The " + dataContent + " deleted", Toast.LENGTH_SHORT).show();
////                            btnGetAll.callOnClick();
////                            return;
////                        }
////                        if (gotoClick) {
////                            //do goto
////                            ((MainActivity) getActivity()).startContentFragment(dataContent);
////                            return;
////                        }
////                        new Handler().postDelayed(new Runnable() {
////                            @Override
////                            public void run() {
////                                deleteClick = false;
////                                gotoClick = false;
////                            }
////                        }, 1000);
//                    }
//                });
//            }else{
//                Toast.makeText(v.getContext(), "No Content!", Toast.LENGTH_SHORT).show();
//            }
//            TextView tvGoto= (TextView) v.findViewById(R.id.algorithm_name);
//            TextView tvDel = (TextView) v.findViewById(R.id.algorithm_delete);
//            ListAdapter adapter = new SimpleAdapter(v.getContext(), algorithmList, R.layout.view_db_entry, new String[]{"id", "topic", "content"}, new int[]{R.id.algorithm_Id, R.id.algorithm_name, R.id.algorithm_delete});
//        setListAdapter(adapter);
//        }
//    }
//}