//package com.fox_lee.yunwen.lolinfimobile_struct.Adapter;
//import android.content.Context;
//import android.util.Log;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.BaseAdapter;
//import android.widget.TextView;
//
//import com.fox_lee.yunwen.lolinfimobile_struct.Utility.HashMapContent;
//import com.fox_lee.yunwen.lolinfomobile_struct.R;
//
//import java.util.HashMap;
//import java.util.Set;
//
//public class ContentAdapter extends BaseAdapter<String> {
//    private final Context context;
//    private final String values;
//
//    public ContentAdapter(Context context, String values) {
//        super();
//        this.context = context;
//        this.values = values;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater = (LayoutInflater) context
//                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//        View rowView = inflater.inflate(R.layout.content_list_element, parent, false);
//
//
//        HashMap hm = new HashMap();
//        HashMapContent hashMapContent = new HashMapContent();
//        hm = hashMapContent.getAir();
//        Log.d("FragmentContent", "The value is: " + values.toString());
//        Log.d("FragmentContent", "The content is: " + hm.get(values).toString());
//
//        TextView textView = (TextView) rowView.findViewById(R.id.data_content);
//        textView.setText("something");
//
//        return rowView;
//    }
//}
