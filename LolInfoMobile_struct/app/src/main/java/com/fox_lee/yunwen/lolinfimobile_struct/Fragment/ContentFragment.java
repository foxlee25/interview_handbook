package com.fox_lee.yunwen.lolinfimobile_struct.Fragment;
import android.app.AlertDialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.fox_lee.yunwen.lolinfimobile_struct.Activity.MainActivity;
import com.fox_lee.yunwen.lolinfimobile_struct.Model.HashMapContent;
import com.fox_lee.yunwen.lolinfomobile_struct.R;

import org.w3c.dom.Text;

import java.util.HashMap;

/**
 * Created by Yunwen on 2/11/2016.
 */

//implements View.OnClickListener
public class ContentFragment extends  Fragment {
    String dataContent;
    String[] frag1;
    String[] frag2;
    String[] frag3;
    String[] frag4;
    String[] frag5;
    String[] frag6;

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
        TextView cv = (TextView) view.findViewById(R.id.code_view);
        TextView tv2= (TextView) view.findViewById(R.id.text_view2);
        TextView cv1 = (TextView) view.findViewById(R.id.code_view1);
        TextView tv3= (TextView) view.findViewById(R.id.text_view3);
        TextView cv2 = (TextView) view.findViewById(R.id.code_view2);
        TextView tv4= (TextView) view.findViewById(R.id.text_view4);
        Button btnAnswer= (Button) view.findViewById(R.id.btn_getAnswer);
        final TextView tvAnswer = (TextView) view.findViewById(R.id.text_getAnswer);
        final ImageView imgAnswer = (ImageView) view.findViewById(R.id.img_getAnswer);

        switch (dataContent) {
            case "Basics":
                cv.setVisibility(View.GONE);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                tv4.setText("Question: XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
                btnAnswer.setVisibility(view.VISIBLE);
                tvAnswer.setText("性质：\n" +
                        "\n" +
                        "交换操作和数组中导致的数量相同\n" +
                        "比较次数>=倒置数量，<=倒置的数量加上数组的大小减一\n" +
                        "每次交换都改变了两个顺序颠倒的元素的位置，即减少了一对倒置，倒置数量为0时即完成排序。\n" +
                        "每次交换对应着一次比较，且1到N-1之间的每个i都可能需要一次额外的记录(a[i]未到达数组左端时)\n" +
                        "最坏情况下需要~N^2/2次比较和~N^2/2次交换，最好情况下需要N-1次比较和0次交换。\n" +
                        "平均情况下需要~N^2/4次比较和~N^2/4次交换\n" +
                        "希尔排序\n" +
                        "\n" +
                        "核心：基于插入排序，使数组中任意间隔为h的元素都是有序的，即将全部元素分为h个区域使用插入排序。其实现可类似于插入排序但使用不同增量。更高效的原因是它权衡了 子数组的规模和有序性。\n" +
                        "\n" +
                        "实现(C++):");
                
                btnAnswer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tvAnswer.setVisibility(v.VISIBLE);
                        imgAnswer.setVisibility(v.GONE);
                    }
                });

                break;
            case "Linked List":
                frag1 = hm.get(dataContent).toString().split("public ");
                frag2 = frag1[1].split("删除链表", 2);
                tv.setText(frag1[0]);
                cv.setText("public " + frag2[0]);
                tv2.setText("删除链表" + frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Bubble Sort":
                frag1 = hm.get(dataContent).toString().split("#!/usr/bin/env python");
                frag2 = frag1[1].split("Reference", 2);
                tv.setText(frag1[0]);
                cv.setText("#!/usr/bin/env python" + frag2[0]);
                tv2.setText("Reference" + frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Selection Sort":
                Log.d("Content Fragment", "Selection Sort");
                frag1 = hm.get(dataContent).toString().split("#!/usr/bin/env python");
                frag2 = frag1[1].split("性质：", 2);
                tv.setText(frag1[0]);
                cv.setText("#!/usr/bin/env python" + frag2[0]);
                tv2.setText("性质：" + frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Insertion Sort":
                Log.d("Content Fragment", "Selection Sort");
                frag1 = hm.get(dataContent).toString().split("#!/usr/bin/env python");
                frag2 = frag1[1].split("性质：", 2);
//                Log.d("Content Fragment", "frag3 is"+ frag3[0] +" and "+ frag3[1]);
                tv.setText(frag1[0]);
                cv.setText("#!/usr/bin/env python" + frag2[0]);
                tv2.setText("性质：\n" +
                        "\n" +
                        "交换操作和数组中导致的数量相同\n" +
                        "比较次数>=倒置数量，<=倒置的数量加上数组的大小减一\n" +
                        "每次交换都改变了两个顺序颠倒的元素的位置，即减少了一对倒置，倒置数量为0时即完成排序。\n" +
                        "每次交换对应着一次比较，且1到N-1之间的每个i都可能需要一次额外的记录(a[i]未到达数组左端时)\n" +
                        "最坏情况下需要~N^2/2次比较和~N^2/2次交换，最好情况下需要N-1次比较和0次交换。\n" +
                        "平均情况下需要~N^2/4次比较和~N^2/4次交换\n" +
                        "希尔排序\n" +
                        "\n" +
                        "核心：基于插入排序，使数组中任意间隔为h的元素都是有序的，即将全部元素分为h个区域使用插入排序。其实现可类似于插入排序但使用不同增量。更高效的原因是它权衡了 子数组的规模和有序性。\n" +
                        "\n" +
                        "实现(C++):");
                cv2.setVisibility(View.GONE);
                cv1.setText( "template\n" +
                        "void shell_sort(T arr[], int len) {\n" +
                        "    int gap, i, j;\n" +
                        "    T temp;\n" +
                        "    for (gap = len >> 1; gap > 0; gap >>= 1)\n" +
                        "        for (i = gap; i < len; i++) {\n" +
                        "            temp = arr[i];\n" +
                        "            for (j = i - gap; j >= 0 && arr[j] > temp; j -= gap)\n" +
                        "                arr[j + gap] = arr[j];\n" +
                        "            arr[j + gap] = temp;\n" +
                        "        }\n" +
                        "}" );
                tv3.setText("Reference\n" +
                        "\n" +
                        "插入排序 - 维基百科，自由的百科全书 * 希尔排序 - 维基百科，自由的百科全书\n" +
                        "The Insertion Sort — Problem Solving with Algorithms and Data Structures");
                break;

            case "Merge Sort":
                frag1 = hm.get(dataContent).toString().split("#!/usr/bin/env python");
                frag2 = frag1[1].split("原地归并", 2);
                frag3 = frag2[1].split("辅助函数：用于将已排序好的两个数组归并。", 2);
                frag4 = frag3[1].split("时间复杂度为NlogN，但是空间复杂度为N。",2);
                tv.setText(frag1[0]);
                cv.setText("#!/usr/bin/env python" + frag2[0]);
                tv2.setText("原地归并：" + frag3[0] + "辅助函数：用于将已排序好的两个数组归并。");
                cv1.setText(frag4[0]);
                tv3.setText("时间复杂度为NlogN，但是空间复杂度为N。" + frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Quick Sort":
                frag1 = hm.get(dataContent).toString().split("#!/usr/bin/env python");
                frag2 = frag1[1].split("递归 ", 2);

                tv.setText(frag1[0]);
                cv.setText("#!/usr/bin/env python" + frag2[0]);
                tv2.setText("递归 " + frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;

            case "Bit Manipulation":
                frag1 = hm.get(dataContent).toString().split("异或操作的一些特点：");
                frag2 = frag1[1].split("移位操作\n" +
                        "\n" +
                        "移位操作", 2);

                tv.setText(frag1[0] + "异或操作的一些特点：" );
                cv.setText(frag2[0]);
                tv2.setText("移位操作\n" +
                        "\n" +
                        "移位操作" + frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "strStr":
                frag1 = hm.get(dataContent).toString().split("strstr ");
                frag2 = frag1[1].split("题解\n" +
                        "\n" +
                        "对于字符串查找问题，可使用双重for循环解决，效率更高的则为KMP算法。\n" +
                        "\n" +
                        "Java", 2);
                frag3 = frag2[1].split("源码分析", 2);
                frag4 = frag3[1].split("Another Similar Question",2);
                tv.setText(frag1[0]);
                cv.setText("strstr " + frag2[0]);
                tv2.setText("题解\n" +
                        "\n" +
                        "对于字符串查找问题，可使用双重for循环解决，效率更高的则为KMP算法。\n" +
                        "\n" +
                        "Java");
                cv1.setText(frag3[0]);
                tv3.setText("源码分析" + frag4[0] + "Another Similar Question");
                cv2.setText(frag4[1]);
                break;
            case "Two Strings Are Anagrams":
                frag1 = hm.get(dataContent).toString().split("此题的变形题。");
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "两", 2);
                frag3 = frag2[1].split("复杂度则较高。", 2);
                frag4 = frag3[1].split("源码分析\n" +
                        "\n" +
                        "对",2);
                tv.setText(frag1[0] + "此题的变形题。");
                cv.setText(frag2[0]);
                tv2.setText("源码分析\n" +
                        "\n" +
                        "两" + frag3[0] + "复杂度则较高。");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "对" + frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Compare Strings":
                frag1 = hm.get(dataContent).toString().split("class Solution");
                frag2 = frag1[1].split("源码解析", 2);

                tv.setText(frag1[0] );
                cv.setText("class Solution" + frag2[0]);
                tv2.setText( frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Anagrams":
                frag1 = hm.get(dataContent).toString().split("加入到最终结果中。");
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "strs", 2);
                frag3 = frag2[1].split("取出放入最终结果中。", 2);
                frag4 = frag3[1].split("源码分析\n" +
                        "\n" +
                        "建立 k", 2);

                tv.setText(frag1[0] + "加入到最终结果中。");
                cv.setText(frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" +
                        "strs" + frag3[0] + "取出放入最终结果中。");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "建立 k" + frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Longest Common Substring":
                frag1 = hm.get(dataContent).toString().split("到相等的字符时则同时向后移动一位。");
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "异", 2);

                tv.setText(frag1[0] + "到相等的字符时则同时向后移动一位。");
                cv.setText(frag2[0]);
                tv2.setText("源码分析\n" +
                        "\n" +
                        "异" + frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Remove Element":
                frag1 = hm.get(dataContent).toString().split("并往后继续遍历。");
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "注", 2);
                frag3 = frag2[1].split("后「新数组」的长度。", 2);
                frag4 = frag3[1].split("源码分析\n" +
                        "\n" +
                        "遍历", 2);

                tv.setText(frag1[0] + "并往后继续遍历。");
                cv.setText(frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" +
                        "strs" + frag3[0] + "后「新数组」的长度。");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "遍历" + frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Zero Sum Subarray":
                frag1 = hm.get(dataContent).toString().split("终结果并返回。");
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "使", 2);
                frag3 = frag2[1].split("贵的时间资源 :", 2);
                frag4 = frag3[1].split("源码分析\n" +
                        "\n" +
                        "为", 2);
                frag5 = frag4[1].split("参考sort_pair_second.",2);
                frag6 = frag5[1].split("源码分析\n" +
                        "\n" +
                        "没",2);

                tv.setText(frag1[0] + "终结果并返回。");
                cv.setText(frag2[0]);
                tv2.setText("源码分析 "
                        + "\n"
                        + "使" + frag3[0] + "贵的时间资源 :");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "为" + frag5[0] + "参考sort_pair_second.");
                cv2.setText(frag6[0]);
                tv4.setText("源码分析\n" +
                        "\n" +
                        "没" + frag6[1]);
                break;
            case "Subarray Sum K":
                frag1 = hm.get(dataContent).toString().split("C++", 3);
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "与", 2);
                frag3 = frag1[2].split("源码分析\n" +
                        "\n" +
                        "使用", 2);


                tv.setText(frag1[0] + "C++");
                cv.setText(frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" +
                        "与" + frag2[1] + "C++");
                cv1.setText(frag3[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "使" + frag3[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Subarray Sum Closest":
                frag1 = hm.get(dataContent).toString().split("Subarray Sum Closest");
                frag2 = frag1[1].split("题解\n" +
                        "\n" +
                        "题", 2);
                frag3 = frag2[1].split("C++", 2);
                frag4 = frag3[1].split("源码分析\n" +
                        "\n" +
                        "为", 2);

                tv.setText(frag1[0] + "Subarray Sum Closest");
                cv.setText(frag2[0]);
                tv2.setText( "题解\n" +
                        "\n" +
                        "题" + frag3[0] + "C++");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "为" + frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Product of Array Exclude Itself":
                frag1 = hm.get(dataContent).toString().split("C++", 3);
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "一次", 2);
                frag3 = frag1[2].split("源码分析\n" +
                        "\n" +
                        "计算", 2);


                tv.setText(frag1[0] + "C++");
                cv.setText(frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" + frag2[1] + "C++");
                cv1.setText(frag3[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "计算" + frag3[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Partition Array":
                frag1 = hm.get(dataContent).toString().split("即为所求。", 2);
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "自左", 2);
                frag3 = frag2[1].split("直至 left>right.", 2);
                frag4 = frag3[1].split("源码分析\n" +
                        "\n" +
                        "大循", 2);

                tv.setText(frag1[0] + "即为所求。");
                cv.setText(frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" +
                        "自左" + frag3[0] + "直至 left>right.");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "大循" + frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "First Missing Positive":
                frag1 = hm.get(dataContent).toString().split("小再加1呗。");
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "核心", 2);
                frag3 = frag2[1].split("注意交换的写法，若写成", 2);
                frag4 = frag3[1].split("这又是满满的 bug", 2);

                tv.setText(frag1[0] + "小再加1呗。");
                cv.setText(frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" +
                        "核心" + frag3[0] + "注意交换的写法，若写成");
                cv1.setText(frag4[0]);
                tv3.setText("这又是满满的 bug" + frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "2 Sum":
                frag1 = hm.get(dataContent).toString().split("大功告成！",2);
                frag2 = frag1[1].split("源码分析", 4);
                frag3 = frag2[1].split("Python",2);
                frag4 = frag2[2].split("直至找到满足 条件的索引为止。",2);

                tv.setText(frag1[0] + "大功告成！");
                cv.setText(frag2[0]);
                tv2.setText( "源码分析" + frag3[0] + "Python");
                cv1.setText(  frag3[1]);
                tv3.setText("源码分析" + frag4[0] + "直至找到满足 条件的索引为止。");
                cv2.setText(frag4[1]);
                tv4.setText("源码分析"+frag2[3]);
                break;
            case "3 Sum":
                frag1 = hm.get(dataContent).toString().split("class Solution:");
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "异常处理", 2);


                tv.setText(frag1[0] );
                cv.setText("class Solution:"+frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" +
                        "异常处理" + frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "3 Sum Closest":
                frag1 = hm.get(dataContent).toString().split("class Solution:");
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "leetcode", 2);


                tv.setText(frag1[0] );
                cv.setText("class Solution:"+frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" +
                        "leetcode" + frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Remove Duplicates from Sorted Array":
                frag1 = hm.get(dataContent).toString().split("class Solution");
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "注意", 2);


                tv.setText(frag1[0] );
                cv.setText("class Solution"+frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" +
                        "注意" + frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Remove Duplicates from Sorted Array II":
                frag1 = hm.get(dataContent).toString().split("class Solution");
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "在数组", 2);


                tv.setText(frag1[0] );
                cv.setText("class Solution"+frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" +
                        "在数组" + frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Merge Sorted Array":
                frag1 = hm.get(dataContent).toString().split("取较大的置于新数组尾部元素中。");
                frag2 = frag1[1].split("Java", 2);
                frag3 = frag2[1].split("C++", 2);
                frag4 = frag3[1].split("源码分析\n" +
                        "\n" +
                        "分三种", 2);

                tv.setText(frag1[0] + "取较大的置于新数组尾部元素中。");
                cv.setText(frag2[0]);
                tv2.setText( "Java");
                cv1.setText(frag3[0]);
                tv3.setText("C++");
                cv2.setText(frag4[0]);
                tv4.setText("源码分析\n" +
                        "\n" +
                        "分三种" + frag4[1]);
                break;
            case "Merge Sorted Array II":
                frag1 = hm.get(dataContent).toString().split("Java");
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "因为本题", 2);
                frag3 = frag2[1].split("C++", 2);


                tv.setText(frag1[0] + "Java");
                cv.setText(frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" +
                        "因为本题" + frag3[0] + "C++");
                cv1.setText(frag3[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Binary Search":
                frag1 = hm.get(dataContent).toString().split("Java");
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "首先", 2);


                tv.setText(frag1[0] + "Java");
                cv.setText("class Solution"+frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" +
                        "首先" + frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Search Insert Position":
                frag1 = hm.get(dataContent).toString().split("Java");
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "要注意", 2);


                tv.setText(frag1[0] + "Java");
                cv.setText("class Solution"+frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" +
                        "要注意" + frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Search for a Range":
                frag1 = hm.get(dataContent).toString().split("Java");
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "首先", 2);


                tv.setText(frag1[0] + "Java");
                cv.setText("class Solution"+frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" +
                        "首先" + frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "First Bad Version":
                frag1=hm.get(dataContent).toString().split("找出左边界即可。");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "找左",2);
                frag3=frag2[1].split("Python",2);


                tv.setText(frag1[0]+"");
                cv.setText(frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "找左"+frag3[0]+"Python");
                cv1.setText(frag3[1]);

                cv2.setVisibility(View.GONE);
                break;
            case "Search a 2D Matrix":
                frag1=hm.get(dataContent).toString().split("Java");
                frag2=frag1[1].split("源码分析\n" +
                        "\n" +
                        "仍然", 2);


                tv.setText(frag1[0]+ "Java");
                cv.setText(frag2[0]);
                tv2.setText("源码分析\n" +
                        "\n" +
                        "仍然" + frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Find Peak Element":
                frag1=hm.get(dataContent).toString().split("就不能用二分法了。");
                frag2=frag1[1].split("如果一开始做的是 leetcode ",2);
                frag3=frag2[1].split("readily understood",2);
                frag4=frag3[1].split("源码分析\n" +
                        "\n" +
                        "典型",2);
                frag5=frag4[1].split("implementationleetcode_discussion",2);
                frag6=frag5[1].split("leetcode 和 lintcode ",2);

                tv.setText(frag1[0]+"就不能用二分法了。");
                cv.setText(frag2[0]);
                tv2.setText("如果一开始做的是 leetcode "+frag3[0]+"readily understood");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n"+
                        "\n"+
                        "典型"+frag5[0]+"implementationleetcode_discussion");
                cv2.setText(frag6[0]);
                tv4.setText("leetcode 和 lintcode" +frag6[1]);
                break;
            case "Search in Rotated Sorted Array":
                frag1=hm.get(dataContent).toString().split("析较为方便。");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "若target",2);
                frag3=frag2[1].split("则返回-1.",2);
                frag4=frag3[1].split("Search in Rotated Sorted Array II",2);
                frag5=frag4[1].split("C++",2);
                frag6=frag5[1].split("源码分析\n"+
                        "\n"+
                        "在A",2);

                tv.setText(frag1[0]+"析较为方便。");
                cv.setText(frag2[0]);
                tv2.setText("源码分析"
                        +"\n"
                        +"若target"+frag3[0]+"则返回-1.");
                cv1.setText(frag4[0]);
                tv3.setText("Search in Rotated Sorted Array II"+frag5[0]+"C++");
                cv2.setText(frag6[0]);
                tv4.setText("源码分析\n" +
                        "\n" +
                        "在A" + frag6[1]);
                break;
            case "Find Minimum in Rotated Sorted Array":
                frag1 = hm.get(dataContent).toString().split("则 无需图中右侧的特殊情况。");
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "仅需", 2);
                frag3 = frag2[1].split("逐步缩小范围。", 2);


                tv.setText(frag1[0] + "则 无需图中右侧的特殊情况。");
                cv.setText(frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" +
                        "仅需" + frag3[0] + "逐步缩小范围。");
                cv1.setText(frag3[1]);
                cv2.setVisibility(View.GONE);
                break;

            case "Search a 2D Matrix II":
                frag1=hm.get(dataContent).toString().split("进行测试去帮助发现规律。");
                frag2=frag1[1].split("Java", 2);
                frag3=frag2[1].split("源码分析\n" +
                        "\n" +
                        "首先",2);


                tv.setText(frag1[0]+"进行测试去帮助发现规律。");
                cv.setText(frag2[0]);
                tv2.setText("Java");
                cv1.setText(frag3[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "首先"+frag3[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Median of two Sorted Arrays":
                frag1 = hm.get(dataContent).toString().split("class Solution",2);
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "此题", 2);
                frag3 = frag2[1].split("Java", 2);
                frag4 = frag3[1].split("源码分析\n" +
                        "\n" +
                        "本题", 2);

                tv.setText(frag1[0]);
                cv.setText("class Solution"+frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" +
                        "此题" + frag3[0] + "Java");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "本题" + frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Sqrt x":
                frag1=hm.get(dataContent).toString().split("Python");
                frag2=frag1[1].split("源码分析\n" +
                        "\n" +
                        "异常", 2);


                tv.setText(frag1[0]+"Python");
                cv.setText(frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "异常z"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Wood Cut":
                frag1=hm.get(dataContent).toString().split("Python");
                frag2=frag1[1].split("源码分析\n" +
                        "\n" +
                        "异常", 2);


                tv.setText(frag1[0]+"Python");
                cv.setText(frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "异常z"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Single Number":
                frag1=hm.get(dataContent).toString().split("class Solution");
                frag2=frag1[1].split("源码分析\n" +
                        "\n" +
                        "异常", 2);


                tv.setText(frag1[0]);
                cv.setText("class Solution" + frag2[0]);
                tv2.setText("源码分析\n" +
                        "\n" +
                        "异常"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Single Number II":
                frag1=hm.get(dataContent).toString().split(" bit by bit");
                frag2=frag1[1].split("源码解析\n" +
                        "\n" +
                        "异常",2);
                frag3=frag2[1].split("Java",2);


                tv.setText(frag1[0]+" bit by bit");
                cv.setText(frag2[0]);
                tv2.setText("源码解析\n" +
                        "\n" +
                        "异常"+frag3[0]+"Java");
                cv1.setText(frag3[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "O(1) Check Power of 2":
                frag1=hm.get(dataContent).toString().split("Python");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "除了",2);


                tv.setText(frag1[0]+"Python");
                cv.setText(""+frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "除了"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Convert Integer A to Integer B":
                frag1=hm.get(dataContent).toString().split("数中0的个数。");
                frag2=frag1[1].split("源码分析\n" +
                        "\n" +
                        "Python ", 2);


                tv.setText(frag1[0]+"数中0的个数。");
                cv.setText(""+frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "Python "+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Factorial Trailing Zeroes":
                frag1 = hm.get(dataContent).toString().split("Python",2);
                frag2 = frag1[1].split("源码分析\n" +
                        "\n" +
                        "异常", 2);
                frag3 = frag2[1].split("Python", 2);
                frag4 = frag3[1].split("源码分析\n" +
                        "\n" +
                        "这里", 2);

                tv.setText(frag1[0] + "Python");
                cv.setText(frag2[0]);
                tv2.setText( "源码分析\n" +
                        "\n" +
                        "异常" + frag3[0] + "Python");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "这里" + frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Remove Duplicates from Sorted List":
                frag1=hm.get(dataContent).toString().split("当前节点next的指针值。");
                frag2=frag1[1].split("源码分析\n" +
                        "\n" +
                        "首先", 2);
                frag3=frag2[1].split("遍历。\n" +
                        "Java",2);
                frag4=frag3[1].split("Java版有个",2);

                tv.setText(frag1[0]+"当前节点next的指针值。");
                cv.setText(frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "首先"+frag3[0]+"遍历。\n" +
                        "Java");
                cv1.setText(frag4[0]);
                tv3.setText("Java版有个"+frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Remove Duplicates from Sorted List II":
                frag1=hm.get(dataContent).toString().split("Wrong");
                frag2=frag1[1].split("错在什么地方？\n" +
                        "\n" +
                        "节点", 2);
                frag3=frag2[1].split("正确实现及解析。",2);
                frag4=frag3[1].split("源码分析\n" +
                        "\n" +
                        "首先",2);

                tv.setText(frag1[0]+"Wrong");
                cv.setText(frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "节点"+frag3[0]+"正确实现及解析。");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "首先"+frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Partition List":
                frag1=hm.get(dataContent).toString().split("dummy节点这个大杀器。");
                frag2=frag1[1].split("源码分析\n" +
                        "\n" +
                        "异常", 2);


                tv.setText(frag1[0] + "dummy节点这个大杀器。");
                cv.setText(frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "异常"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Two Lists Sum":
                frag1=hm.get(dataContent).toString().split("Iteration");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "迭代",2);


                tv.setText(frag1[0] + "Iteration");
                cv.setText(""+frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "迭代"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;

            case "Remove Nth Node From End of List":
                frag1=hm.get(dataContent).toString().split("域即可。");
                frag2=frag1[1].split("以上代码单独判", 2);
                frag3=frag2[1].split("dummy node",2);
                frag4=frag3[1].split("源码分析",2);

                tv.setText(frag1[0]+"域即可。");
                cv.setText(frag2[0]);
                tv2.setText("以上代码单独判"+frag3[0]+"dummy node");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析"+frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Linked List Cycle":
                frag1=hm.get(dataContent).toString().split("链表有环。");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "异常",2);


                tv.setText(frag1[0] + "链表有环。");
                cv.setText(""+frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "异常"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Linked List Cycle II":
                frag1=hm.get(dataContent).toString().split("进行初始化。");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "异常",2);
                tv.setText(frag1[0] + "进行初始化。");
                cv.setText(""+frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "异常"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Reverse Linked List":
                frag1=hm.get(dataContent).toString().split("用于下一次循环");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "题解",2);


                tv.setText(frag1[0] + "用于下一次循环");
                cv.setText(""+frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "题解"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Reverse Linked List II":
                frag1=hm.get(dataContent).toString().split("返回dummy->next");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "处理",2);


                tv.setText(frag1[0] + "返回dummy->next");
                cv.setText(""+frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "处理"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Merge Two Sorted Lists":
                frag1=hm.get(dataContent).toString().split("lastNode->next中。");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "异常",2);


                tv.setText(frag1[0] + "lastNode->next中。");
                cv.setText(""+frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "异常"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Merge k Sorted Lists":
                frag1=hm.get(dataContent).toString().split("容易出现 TLE.");
                frag2=frag1[1].split("源码分析\n" +
                        "\n" +
                        "由于头节点", 2);
                frag3=frag2[1].split("soulmachine。",2);
                frag4=frag3[1].split("源码分析\n" +
                        "\n" +
                        "实现",2);
                frag5=frag4[1].split("优化幅度较大。",2);
                frag6=frag5[1].split("源码分析\n" +
                        "\n" +
                        "由于需要",2);

                tv.setText(frag1[0]+"容易出现 TLE.");
                cv.setText(frag2[0]);
                tv2.setText("源码分析"
                        +"\n"
                        +"由于头节点"+frag3[0]+"soulmachine。");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "实现"+ frag5[0]+"优化幅度较大。");
                cv2.setText(frag6[0]);
                tv4.setText("源码分析\n" +
                        "\n" +
                        "由于需要"+frag6[1]);
                break;
            case "Sort List":
                frag1=hm.get(dataContent).toString().split("新鲜出炉的源码如下。");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "归并子程",2);
                frag3=frag2[1].split("针的起始位置。",2);
                frag4=frag3[1].split("源码分析\n" +
                        "\n" +
                        "异常",2);

                tv.setText(frag1[0]+"新鲜出炉的源码如下。");
                cv.setText(frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "归并子程"+frag3[0]+"针的起始位置。");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "异常"+frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Reorder List":
                frag1=hm.get(dataContent).toString().split("较大的优化空间！");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "异常",2);
                frag3=frag2[1].split("语惊醒梦中人。",2);
                frag4=frag3[1].split("源码分析\n" +
                        "\n" +
                        "相对",2);

                tv.setText(frag1[0]+"较大的优化空间！");
                cv.setText(frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "异常"+frag3[0]+"语惊醒梦中人。");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "相对"+frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Recover Rotated Sorted Array":
                frag1=hm.get(dataContent).toString().split("使用for循环移位交换即可。");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "首先",2);


                tv.setText(frag1[0]+"使用for循环移位交换即可。");
                cv.setText(""+frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "首先"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Rotate String":
                frag1=hm.get(dataContent).toString().split("offset位置。");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "异常",2);


                tv.setText(frag1[0]+"offset位置。");
                cv.setText(""+frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "异常"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Reverse Words in a String":
                frag1=hm.get(dataContent).toString().split("加入空格即可。");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "首先",2);


                tv.setText(frag1[0]+"加入空格即可。");
                cv.setText(""+frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "首先"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Binary Tree Preorder Traversal":
                frag1=hm.get(dataContent).toString().split("分治两种方法。");
                frag2=frag1[1].split("源码分析\n" +
                        "\n" +
                        "使用", 2);
                frag3=frag2[1].split(" and Conquer",2);
                frag4=frag3[1].split("源码分析\n" +
                        "\n" +
                        "由于",2);
                frag5=frag4[1].split("为止。",2);
                frag6=frag5[1].split("源码分析\n" +
                        "\n" +
                        "对root",2);

                tv.setText(frag1[0]+"分治两种方法。");
                cv.setText(frag2[0]);
                tv2.setText("源码分析"
                        +"\n"
                        +"使用"+frag3[0]+" and Conquer");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "由于"+frag5[0]+"为止。");
                cv2.setText(frag6[0]);
                tv4.setText("源码分析\n" +
                        "\n" +
                        "对root"+frag6[1]);
                break;
            case "Binary Tree Inorder Traversal":
                frag1=hm.get(dataContent).toString().split("的顺序即可。");
                frag2=frag1[1].split("题解 - 迭代版",2);
                frag3=frag2[1].split("Iteration",2);


                tv.setText(frag1[0]+"的顺序即可。");
                cv.setText(frag2[0]);
                tv2.setText("题解 - 迭代版"+frag3[0]+"Iteration");
                cv1.setText(frag3[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Binary Tree Postorder Traversal":
                frag1=hm.get(dataContent).toString().split("便于理解。");
                frag2=frag1[1].split("题解 - 迭代", 2);
                frag3=frag2[1].split("访问记录。",2);
                frag4=frag3[1].split("源码解析\n" +
                        "\n" +
                        "使用",2);

                tv.setText(frag1[0]+"便于理解。");
                cv.setText(frag2[0]);
                tv2.setText("题解 - 迭代"+frag3[0]+"访问记录。");
                cv1.setText(frag4[0]);
                tv3.setText("源码解析\n" +
                        "\n" +
                        "使用"+frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Binary Tree Level Order Traversal":
                frag1=hm.get(dataContent).toString().split("每层的节点即可。");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "异常",2);
                tv.setText(frag1[0]+"每层的节点即可。");
                cv.setText(""+frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "异常"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Maximum Depth of Binary Tree":
                frag1=hm.get(dataContent).toString().split(" 之间。");
                frag2=frag1[1].split("题解 - 迭代",2);
                frag3=frag2[1].split("进行比较。",2);
                frag4=frag3[1].split("题解 - 迭代",2);
                frag5=frag4[1].split("替代即可。",2);
                tv.setText(frag1[0]+"");
                cv.setText(frag2[0]);
                tv2.setText("题解 - 迭代"+frag3[0]+"进行比较。");
                cv1.setText(frag4[0]);
                tv3.setText("题解 - 迭代"+frag5[0]+"替代即可。");
                cv2.setText(frag5[1]);
                break;
            case "Balanced Binary Tree":
                frag1=hm.get(dataContent).toString().split("这种方法。",2);
                frag2=frag1[1].split("源码解析\n" +
                        "\n" +
                        "如果",2);
                frag3=frag2[1].split("精妙的多，赞！",2);


                tv.setText(frag1[0]+"这种方法。");
                cv.setText(frag2[0]);
                tv2.setText("源码解析\n" +
                        "\n" +
                        "如果"+frag3[0]+"精妙的多，赞！");
                cv1.setText(frag3[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Binary Tree Maximum Path Sum":
                frag1=hm.get(dataContent).toString().split("采用递归。");
                frag2=frag1[1].split("源码分析\n" +
                        "\n" +
                        "注意", 2);
                frag3=frag2[1].split("解决。",2);
                frag4=frag3[1].split("源码分析\n" +
                        "\n" +
                        "除了",2);
                frag5=frag4[1].split("子画一画。",2);
                frag6=frag5[1].split("源码分析\n" +
                        "\n" +
                        "如果",2);

                tv.setText(frag1[0]+"采用递归。");
                cv.setText(frag2[0]);
                tv2.setText("源码分析"
                        +"\n"
                        +"注意"+frag3[0]+"解决。");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "除了"+frag5[0]+"子画一画。");
                cv2.setText(frag6[0]);
                tv4.setText("源码分析\n" +
                        "\n" +
                        "如果"+frag6[1]);
                break;
            case "Lowest Common Ancestor":
                frag1=hm.get(dataContent).toString().split("序遍历来实现。");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "结合",2);
                frag3=frag2[1].split("的情况的方法",2);
                frag4=frag3[1].split("其实这个代码只是把上一个版本的代",2);
                frag5=frag4[1].split("还是看看代码吧。",2);
                frag6=frag5[1].split("源码分析\n" +
                        "\n" +
                        "在",2);

                tv.setText(frag1[0]+"序遍历来实现。");
                cv.setText(frag2[0]);
                tv2.setText("源码分析"
                        +"\n"
                        +"结合"+frag3[0]+"的情况的方法");
                cv1.setText(frag4[0]);
                tv3.setText("其实这个代码只是把上一个版本的代"+frag5[0]+"还是看看代码吧。");
                cv2.setText(frag6[0]);
                tv4.setText("源码分析\n" +
                        "\n" +
                        "在"+frag6[1]);
                break;
            case "Insert Node in a Binary Search Tree":
                frag1=hm.get(dataContent).toString().split("即可。");
                frag2=frag1[1].split("题解 - 迭代", 2);
                frag3=frag2[1].split("右子节点。\n" +
                        "\n" +
                        "C++",2);
                frag4=frag3[1].split("源码分析\n" +
                        "\n" +
                        "在",2);
                frag5=frag4[1].split("避免死循环。",2);

                tv.setText(frag1[0]+"即可。");
                cv.setText(frag2[0]);
                tv2.setText("题解 - 迭代"+frag3[0]+"右子节点。\n" +
                        "\n" +
                        "C++");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "在"+frag5[0]+"避免死循环。");
                cv2.setText(frag5[1]);

                break;
            case "Validate Binary Search Tree":
                frag1=hm.get(dataContent).toString().split("由上层的其他条件判断。");
                frag2=frag1[1].split("源码分析\n" +
                        "\n" +
                        "这种",2);
                frag3=frag2[1].split("中也有使用",2);
                frag4=frag3[1].split("源码分析\n" +
                        "\n" +
                        "根据",2);
                frag5=frag4[1].split("否符合定义。",2);
                frag6=frag5[1].split("题解4 - 迭代",2);

                tv.setText(frag1[0]+"由上层的其他条件判断。");
                cv.setText(frag2[0]);
                tv2.setText("源码分析\n" +
                        "\n" +
                        "这种"+frag3[0]+"中也有使用");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "根据"+frag5[0]+"否符合定义。");
                cv2.setText(frag6[0]);
                tv4.setText("题解4 - 迭代"+frag6[1]);
                break;
            case "Search Range in Binary Search Tree":
                frag1=hm.get(dataContent).toString().split("建一个私有方法即可。");
                frag2=frag1[1].split("源码分析\n" +
                        "\n" +
                        "以上",2);
                frag3=frag2[1].split("如下：",2);
                frag4=frag3[1].split(">\n" +
                        "\n" +
                        "「剪枝」",2);

                tv.setText(frag1[0]+"建一个私有方法即可。");
                cv.setText(frag2[0]);
                tv2.setText("源码分析\n" +
                        "\n" +
                        "以上"+frag3[0]+"如下：");
                cv1.setText(frag4[0]);
                tv3.setText(">\n" +
                        "\n" +
                        "「剪枝」"+frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Convert Sorted Array to Binary Search Tree":
                frag1=hm.get(dataContent).toString().split("型初步建立。");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "从题解",2);


                tv.setText(frag1[0] + "型初步建立。");
                cv.setText(""+frag2[0]);
                tv2.setText("源码分析\n"+
                        "\n"+
                        "从题解"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
            case "Convert Sorted List to Binary Search Tree":
                frag1=hm.get(dataContent).toString().split("做进一步的分析。");
                frag2=frag1[1].split("源码分析\n" +
                        "\n" +
                        "异常",2);
                frag3=frag2[1].split("进一步简化代码",2);
                frag4=frag3[1].split("源码分析\n" +
                        "\n" +
                        "可以",2);
                frag5=frag4[1].split("避免 length 边界",2);
                frag6=frag5[1].split("源码分析\n" +
                        "\n" +
                        "如果",2);

                tv.setText(frag1[0]+"做进一步的分析。");
                cv.setText(frag2[0]);
                tv2.setText("源码分析\n" +
                        "\n" +
                        "异常"+frag3[0]+"进一步简化代码");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "可以"+frag5[0]+"避免 length 边界");
                cv2.setText(frag6[0]);
                tv4.setText("源码分析\n" +
                        "\n" +
                        "如果"+frag6[1]);
                break;
            case "Binary Search Tree Iterator":
                frag1=hm.get(dataContent).toString().split("Java");
                frag2=frag1[1].split("源码分析\n", 2);
                tv.setText(frag1[0]+"Java");
                cv.setText(""+frag2[0]);
                tv2.setText("源码分析\n"+frag2[1]);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);

                break;
            case "Subsets":
                frag1=hm.get(dataContent).toString().split("Java");
                frag2=frag1[1].split("Notice: backTrack", 2);
                frag3=frag2[1].split("调用\n" +
                        "返回结果result",2);
                frag4=frag3[1].split("Unique Subsets\n" +
                        "\n" +
                        "S",2);
                frag5=frag4[1].split("C++",2);
                frag6=frag5[1].split("Reference",2);

                tv.setText(frag1[0]+"Java");
                cv.setText(frag2[0]);
                tv2.setText("Notice: backTrack"+frag3[0]+"调用\n" +
                        "返回结果result");
                cv1.setText(frag4[0]);
                tv3.setText("Unique Subsets\n" +
                        "\n" +
                        "S"+frag5[0]+"C++");
                cv2.setText(frag6[0]);
                tv4.setText("Reference"+frag6[1]);
                break;
            case "Permutation":
                frag1=hm.get(dataContent).toString().split("需要注意除重。");
                frag2=frag1[1].split("源码分析", 2);
                frag3=frag2[1].split("否则无效。",2);
                frag4=frag3[1].split("源码解析",2);

                tv.setText(frag1[0]+"需要注意除重。");
                cv.setText(frag2[0]);
                tv2.setText("源码分析"+frag3[0]+"否则无效。");
                cv1.setText(frag4[0]);
                tv3.setText("源码解析"+frag4[1]);
                cv2.setVisibility(View.GONE);
                break;
            case "Triangle":
                frag1=hm.get(dataContent).toString().split("看看其实现思路。");
                frag2=frag1[1].split("源码分析\n" +
                        "\n" +
                        "dfs",2);
                frag3=frag2[1].split("面看代码实现。",2);
                frag4=frag3[1].split("由于已经计算出的最短路径值不再重复计算",2);
                frag5=frag4[1].split("状态进行动态规划。",2);
                frag6=frag5[1].split("源码解析\n" +
                        "\n" +
                        "自顶",2);

                tv.setText(frag1[0]+"看看其实现思路。");
                cv.setText(frag2[0]);
                tv2.setText("源码分析\n" +
                        "\n" +
                        "dfs"+frag3[0]+"面看代码实现。");
                cv1.setText(frag4[0]);
                tv3.setText("由于已经计算出的最短路径值不再重复计算"+frag5[0]+"状态进行动态规划。");
                cv2.setText(frag6[0]);
                tv4.setText("源码解析\n" +
                        "\n" +
                        "自顶"+frag6[1]);
                break;
            case "Backpack":
                frag1=hm.get(dataContent).toString().split("值为true的最大S");
                frag2=frag1[1].split("源码分析\n"+
                        "\n"+
                        "异常",2);
                frag3=frag2[1].split("递推得到。",2);
                frag4=frag3[1].split("Backpack II\n" +
                        "\n" +
                        "Source",2);
                frag5=frag4[1].split("详细分析过程见本节。",2);
                frag6=frag5[1].split("Reference",2);

                tv.setText(frag1[0]+"值为true的最大S");
                cv.setText(frag2[0]);
                tv2.setText("源码分析"
                        +"\n"
                        +"异常"+frag3[0]+"递推得到。");
                cv1.setText(frag4[0]);
                tv3.setText("Backpack II\n" +
                        "\n" +
                        "Source"+frag5[0]+"详细分析过程见本节。");
                cv2.setText(frag6[0]);
                tv4.setText("Reference"+frag6[1]);
                break;
            case "Minimum Path Sum":
                frag1=hm.get(dataContent).toString().split("并且使用了递归的错误版本。");
                frag2=frag1[1].split("使用迭代思想进行求解的正确实现：",2);
                frag3=frag2[1].split("源码分析\n" +
                        "\n" +
                        "异常",2);
                frag4=frag3[1].split("分析时建议画图理解。",2);
                frag5=frag4[1].split("初始化时需要设置为",2);

                tv.setText(frag1[0]+"并且使用了递归的错误版本。");
                cv.setText(frag2[0]);
                tv2.setText("使用迭代思想进行求解的正确实现：");
                cv1.setText(frag3[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "异常"+frag4[0]+"分析时建议画图理解。");
                cv2.setText(frag5[0]);
                tv4.setText(""+frag5[1]);
                break;
            case "Unique Paths":
                frag1=hm.get(dataContent).toString().split("Answer:");
                frag2=frag1[1].split("源码分析\n" +
                        "\n" +
                        "异常",2);
                frag3=frag2[1].split("首先来看看错误 的初始化实现。",2);
                frag4=frag3[1].split("源码分析\n" +
                        "\n" +
                        "错误",2);
                frag5=frag4[1].split("则当前行/列后的元素路径数均为0！",2);
                frag6=frag5[1].split("源码分析\n" +
                        "\n" +
                        "异常",2);

                tv.setText(frag1[0]+"Answer:");
                cv.setText(frag2[0]);
                tv2.setText("源码分析\n" +
                        "\n" +
                        "异常"+frag3[0]+"首先来看看错误 的初始化实现。");
                cv1.setText(frag4[0]);
                tv3.setText("源码分析\n" +
                        "\n" +
                        "错误"+frag5[0]+"则当前行/列后的元素路径数均为0！");
                cv2.setText(frag6[0]);
                tv4.setText("源码分析\n" +
                        "\n" +
                        "异常"+frag6[1]);
                break;
            case "Climbing Stairs":
                frag1=hm.get(dataContent).toString().split("已经被利用过一次，");
                frag2=frag1[1].split("异常处理\n" +
                        "初始",2);
                frag3=frag2[1].split("九章算法",2);


                tv.setText(frag1[0]+"已经被利用过一次，");
                cv.setText(frag2[0]);
                tv2.setText("异常处理\n" +
                        "初始"+frag3[0]+"九章算法");
                cv1.setText(frag3[1]);
                cv2.setVisibility(View.GONE);
                break;
            default :
                Log.d("ContentFragment", "The content is: " + hm.get(dataContent).toString());
                tv.setText(hm.get(dataContent).toString());
                cv.setVisibility(View.GONE);
                cv1.setVisibility(View.GONE);
                cv2.setVisibility(View.GONE);
                break;
        }
    }

    private void writeBoard() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    }
}
