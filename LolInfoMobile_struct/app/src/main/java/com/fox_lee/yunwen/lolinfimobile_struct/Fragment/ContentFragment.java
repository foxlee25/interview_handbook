package com.fox_lee.yunwen.lolinfimobile_struct.Fragment;
import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fox_lee.yunwen.lolinfimobile_struct.Model.HashMapContent;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

import java.util.HashMap;

/**
 * Created by Yunwen on 2/11/2016.
 */
public class ContentFragment extends  Fragment{
    String dataContent;
    String[] frag1;
    String[] frag2;
    public void changeData(String dataContent) {
        this.dataContent = dataContent;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.item_text_list, container, false);
        Log.d("Fragment", "Content Fragment Started");
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //set textView and imageView
        Log.d("ContentFragment", "The title is: " + dataContent);
        HashMapContent hashMapContent = new HashMapContent();
        HashMap hm =  hashMapContent.getAir();
        TextView tv = (TextView) view.findViewById(R.id.text_view);
        TextView cv = (TextView) view.findViewById(R.id.code_view);
        TextView tv2= (TextView) view.findViewById(R.id.text_view2);

        //if dataContent = Linked List, then fetch code out: code in the textView of code_view
        switch (dataContent) {
            case "Linked List":
                frag1 = hm.get(dataContent).toString().split("public ");
                frag2 = frag1[1].split("删除链表",2);
                tv.setText(frag1[0]);
                cv.setText("public " + frag2[0]);
                tv2.setText("删除链表" + frag2[1]);
                break;
            case "Bubble Sort":
                Log.d("Content Fragment", "Bubble Sort");
                frag1 = hm.get(dataContent).toString().split("#!/usr/bin/env python");
                frag2 = frag1[1].split("Reference",2);
                tv.setText(frag1[0]);
                cv.setText("#!/usr/bin/env python" + frag2[0]);
                tv2.setText("Reference" + frag2[1]);
                break;
            case "Selection Sort":
                break;
            case "Insertion Sort":
                break;
            case "Merge Sort":
                break;
            case "Quick Sort":
                break;
            case "Bit Manipulation":
                break;
            case "strStr":
                break;
            case "Two Strings Are Anagrams":
                break;
            case "Compare Strings":
                break;
            case "Anagrams":
                break;
            case "Longest Common Substring":
                break;
            case "Remove Element":
                break;
            case "Zero Sum Subarray":
                break;
            case "Subarray Sum K":
                break;
            case "Subarray Sum Closest":
                break;
            case "Product of Array Exclude Itself":
                break;
            case "Partition Array":
                break;
            case "First Missing Positive":
                break;
            case "2 Sum":
                break;
            case "3 Sum":
                break;
            case "3 Sum Closest":
                break;
            case "Remove Duplicates from Sorted Array":
                break;
            case "Remove Duplicates from Sorted Array II":
                break;
            case "Merge Sorted Array":
                break;
            case "Merge Sorted Array II":
                break;
            case "Binary Search":
                break;
            case "Search Insert Position":
                break;
            case "Search for a Range":
                break;
            case "First Bad Version":
                break;
            case "Search a 2D Matrix":
                break;
            case "Find Peak Element":
                break;
            case "Search in Rotated Sorted Array":
                break;
            case "Find Minimum in Rotated Sorted Array":
                break;
            case "Search a 2D Matrix II":
                break;
            case "Median of two Sorted Arrays":
                break;
            case "Sqrt x":
                break;
            case "Wood Cut":
                break;
            case "Single Number":
                break;
            case "Single Number II":
                break;
            case "O(1) Check Power of 2":
                break;
            case "Convert Integer A to Integer B":
                break;
            case "Factorial Trailing Zeroes":
                break;
            default :
                Log.d("ContentFragment", "The content is: " + hm.get(dataContent).toString());
                tv.setText(hm.get(dataContent).toString());
                cv.setVisibility(View.GONE);
                break;
        }

    }

    private void writeBoard() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    }
}
