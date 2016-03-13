package com.fox_lee.yunwen.lolinfimobile_struct.Fragment;
import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.fox_lee.yunwen.lolinfimobile_struct.Model.HashMapContent;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

import java.util.HashMap;

/**
 * Created by Yunwen on 2/11/2016.
 */

//implements View.OnClickListener
public class ContentFragment extends  Fragment {
    private String dataContent;
    private String[] frag1;

    private static boolean showingFirst = true;

    public void changeData(String dataContent) {
        this.dataContent = dataContent;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_content_list, container, false);
        Log.d("Fragment", "Content Fragment Started");
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Log.d("ContentFragment", "The title is: " + dataContent);
        HashMapContent hashMapContent = new HashMapContent();
        HashMap hm =  hashMapContent.getAir();
        TextView tv = (TextView) view.findViewById(R.id.text_view);
        TextView tvTitle= (TextView) view.findViewById(R.id.text_title);
        Button btnAnswer= (Button) view.findViewById(R.id.btn_getAnswer);
        final TextView tvAnswer = (TextView) view.findViewById(R.id.text_getAnswer);
        final ImageView imgAnswer = (ImageView) view.findViewById(R.id.img_getAnswer);

        btnAnswer.setVisibility(view.VISIBLE);
        imgAnswer.setVisibility(view.VISIBLE);
        btnAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (showingFirst == true) {
                    tvAnswer.setVisibility(v.VISIBLE);
                    imgAnswer.setVisibility(v.GONE);
                    showingFirst = false;
                } else {
                    tvAnswer.setVisibility(v.GONE);
                    imgAnswer.setVisibility(v.VISIBLE);
                    showingFirst = true;
                }
            }
        });

        switch (dataContent) {
            case "Basics":
                tvAnswer.setText(hm.get(dataContent).toString() + hm.get("Reference").toString());
                tvTitle.setText("Summary of leetcode and lintcode solution");
                break;

            case "Bubble Sort":
                frag1 = hm.get(dataContent).toString().split("如下所示：");

                tvTitle.setText(frag1[0]+"如下所示：");
                tvAnswer.setText(frag1[1]);
                break;
            case "Selection Sort":
                frag1 = hm.get(dataContent).toString().split("如下所示：");

                tvTitle.setText(frag1[0] + "如下所示：");
                tvAnswer.setText(frag1[1]);
                break;
            case "Insertion Sort":
                frag1 = hm.get(dataContent).toString().split("如下所示：");

                tvTitle.setText(frag1[0] + "如下所示：");
                tvAnswer.setText(frag1[1]);
                break;

            case "Merge Sort":
                frag1 = hm.get(dataContent).toString().split("分治应用。");

                tvTitle.setText(frag1[0] + "分治应用。");
                tvAnswer.setText(frag1[1]);
                break;
            case "Quick Sort":
                frag1 = hm.get(dataContent).toString().split("实现如下所示：", 2);

                tvTitle.setText(frag1[0] + "实现如下所示：");
                tvAnswer.setText(frag1[1]);
                break;
            case "strStr":
                frag1 = hm.get(dataContent).toString().split("题解\n" +
                        "\n" +
                        "对于字符串查找问题，可使用双重for循环解决，效率更高的则为KMP算法。\n" +
                        "\n" +
                        "Java", 2);

                tvTitle.setText(frag1[0] + "\n"+"Java");
                tvAnswer.setText(frag1[1]);
                break;
            case "Two Strings Are Anagrams":
                frag1 = hm.get(dataContent).toString().split("变形题。", 2);

                tvTitle.setText(frag1[0]+"变形题。");
                tvAnswer.setText(frag1[1]);
                break;
            case "Compare Strings":
                frag1 = hm.get(dataContent).toString().split("哈希表。", 2);

                tvTitle.setText(frag1[0] + "哈希表。");
                tvAnswer.setText(frag1[1]);
                break;
            case "Anagrams":
                frag1 = hm.get(dataContent).toString().split("case", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0] + "case");
                tvAnswer.setText(frag1[1]);
                break;
            case "Longest Common Substring":
                frag1 = hm.get(dataContent).toString().split("subsequence.", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0] + "subsequence.");
                tvAnswer.setText(frag1[1]);
                break;
            case "Remove Element":
                frag1 = hm.get(dataContent).toString().split("题解1", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0] + "");
                tvAnswer.setText("题解1"+frag1[1]);
                break;
            case "Zero Sum Subarray":
                frag1 = hm.get(dataContent).toString().split("to zero.", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0] + "to zero.");
                tvAnswer.setText(frag1[1]);
                break;
            case "Subarray Sum K":
                frag1 = hm.get(dataContent).toString().split("题解1", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解1"+frag1[1]);

                break;
            case "Product of Array Exclude Itself":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0] );
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Subarray Sum Closest":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0] );
                tvAnswer.setText("题解"+frag1[1]);
                break;

            case "Partition Array":
                frag1 = hm.get(dataContent).toString().split("题解1", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解1"+frag1[1]);
                break;
            case "First Missing Positive":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "2 Sum":
                frag1 = hm.get(dataContent).toString().split("题解1", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解1"+frag1[1]);
                break;
            case "3 Sum":
                frag1 = hm.get(dataContent).toString().split("题解1", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解1"+frag1[1]);
                break;
            case "3 Sum Closest":
                frag1 = hm.get(dataContent).toString().split("题解1", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解1"+frag1[1]);
                break;
            case "Remove Duplicates from Sorted Array":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Remove Duplicates from Sorted Array II":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Merge Sorted Array":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Merge Sorted Array II":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Binary Search":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Search Insert Position":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                //frag2 = frag1[1].split("源码解析", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Search for a Range":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "First Bad Version":
                frag1 = hm.get(dataContent).toString().split("题 Search for", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题 Search for"+frag1[1]);
                break;
            case "Search a 2D Matrix":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Find Peak Element":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Search in Rotated Sorted Array":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Find Minimum in Rotated Sorted Array":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);                break;

            case "Search a 2D Matrix II":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Median of two Sorted Arrays":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Sqrt x":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Wood Cut":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Single Number":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Single Number II":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "O(1) Check Power of 2":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Convert Integer A to Integer B":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Factorial Trailing Zeroes":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Remove Duplicates from Sorted List":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Remove Duplicates from Sorted List II":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Partition List":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Two Lists Sum":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;

            case "Remove Nth Node From End of List":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Linked List Cycle":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Linked List Cycle II":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Reverse Linked List":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Reverse Linked List II":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Merge Two Sorted Lists":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Merge k Sorted Lists":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Sort List":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Reorder List":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Recover Rotated Sorted Array":
                frag1 = hm.get(dataContent).toString().split("首先", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("首先" + frag1[1]);
                break;
            case "Rotate String":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Reverse Words in a String":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Binary Tree Preorder Traversal":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Binary Tree Inorder Traversal":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Binary Tree Postorder Traversal":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Binary Tree Level Order Traversal":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Maximum Depth of Binary Tree":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Balanced Binary Tree":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Binary Tree Maximum Path Sum":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Lowest Common Ancestor":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Insert Node in a Binary Search Tree":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Validate Binary Search Tree":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Search Range in Binary Search Tree":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Convert Sorted Array to Binary Search Tree":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Convert Sorted List to Binary Search Tree":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Binary Search Tree Iterator":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Subsets":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Permutation":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Triangle":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Backpack":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Minimum Path Sum":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Unique Paths":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            case "Climbing Stairs":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解" + frag1[1]);
                break;
            case "Jump Game":
                frag1 = hm.get(dataContent).toString().split("题解", 2);
                tvTitle.setText(frag1[0]);
                tvAnswer.setText("题解"+frag1[1]);
                break;
            default:
                tv.setText(hm.get(dataContent).toString());
                btnAnswer.setVisibility(view.GONE);
                imgAnswer.setVisibility(view.GONE);
                tvAnswer.setVisibility(view.GONE);
                break;
        }
    }

    private void writeBoard() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    }
}
