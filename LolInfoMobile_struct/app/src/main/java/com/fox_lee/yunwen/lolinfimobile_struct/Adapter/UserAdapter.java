package com.fox_lee.yunwen.lolinfimobile_struct.Adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.fox_lee.yunwen.lolinfomobile_struct.R;

public class UserAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    public UserAdapter(Context context, String[] values) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.content_list_element, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.data_content);
        textView.setText(values[position]);

        return rowView;
    }
}
