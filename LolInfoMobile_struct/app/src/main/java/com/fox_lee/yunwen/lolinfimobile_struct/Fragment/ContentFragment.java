package com.fox_lee.yunwen.lolinfimobile_struct.Fragment;
import android.app.AlertDialog;
import android.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.fox_lee.yunwen.lolinfomobile_struct.R;

import java.util.HashMap;

/**
 * Created by Yunwen on 2/11/2016.
 */

//implements View.OnClickListener
public class ContentFragment extends  Fragment {
    private String dataContent;
    private String[] strings;
    private static boolean showingFirst = true;

    public void changeData(String dataContent) {
        this.dataContent = dataContent;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_content_list, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        showingFirst = true;

        TextView tv = (TextView) view.findViewById(R.id.text_view);
        TextView tvTitle= (TextView) view.findViewById(R.id.text_title);
        Button btnAnswer= (Button) view.findViewById(R.id.btn_getAnswer);
//        Typeface typeFace =Typeface.createFromAsset(getActivity().getAssets(),"fonts/AbrilFatface-Regular.otf");
        final TextView tvAnswer = (TextView) view.findViewById(R.id.text_getAnswer);
//        tvAnswer.setTypeface(typeFace);
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
            case "Linked List":
                strings = getResources().getStringArray(R.array.linked_list_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Binary Tree":
                strings = getResources().getStringArray(R.array.binary_tree_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Binary Search Tree":
                strings = getResources().getStringArray(R.array.binary_search_tree_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Priority Queue":
                strings = getResources().getStringArray(R.array.priority_queue_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Huffman Compression":
                strings = getResources().getStringArray(R.array.huffman_compression_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Bubble Sort":
                strings = getResources().getStringArray(R.array.bubble_sort_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Selection Sort":
                strings = getResources().getStringArray(R.array.selection_sort_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Insertion Sort":
                strings = getResources().getStringArray(R.array.insertion_sort_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Merge Sort":
                strings = getResources().getStringArray(R.array.merge_sort_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Quick Sort":
                strings = getResources().getStringArray(R.array.quick_sort_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Heap Sort":
                strings = getResources().getStringArray(R.array.heap_sort_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Bucket Sort":
                strings = getResources().getStringArray(R.array.bucket_sort_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Counting Sort":
                strings = getResources().getStringArray(R.array.counting_sort_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Bit Manipulation":
                strings = getResources().getStringArray(R.array.bit_manipulation_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "strStr":
                strings = getResources().getStringArray(R.array.strStr_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Two Strings Are Anagrams":
                strings = getResources().getStringArray(R.array.two_string_are_anagrams_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Compare Strings":
                strings = getResources().getStringArray(R.array.compare_strings_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Anagrams":
                strings = getResources().getStringArray(R.array.anagrams_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Longest Common Substring":
                strings = getResources().getStringArray(R.array.longest_common_substring_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Remove Element":
                strings = getResources().getStringArray(R.array.remove_element_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Zero Sum Subarray":
                strings = getResources().getStringArray(R.array.zero_sum_subarray_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Subarray Sum K":
                strings = getResources().getStringArray(R.array.subarray_sum_k_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Subarray Sum Closest":
                strings = getResources().getStringArray(R.array.subarray_sum_closest_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Product of Array Exclude Itself":
                strings = getResources().getStringArray(R.array.product_of_array_exclude_itself_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Partition Array":
                strings = getResources().getStringArray(R.array.partition_array_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "First Missing Positive":
                strings = getResources().getStringArray(R.array.first_missing_positive_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "2 Sum":
                strings = getResources().getStringArray(R.array.two_sum_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "3 Sum":
                strings = getResources().getStringArray(R.array.three_sum_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "3 Sum Closest":
                strings = getResources().getStringArray(R.array.three_sum_closet_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Remove Duplicates from Sorted Array":
                strings = getResources().getStringArray(R.array.remove_duplicates_from_sorted_array_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Remove Duplicates from Sorted Array II":
                strings = getResources().getStringArray(R.array.remove_duplicates_from_sorted_array_two_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Merge Sorted Array":
                strings = getResources().getStringArray(R.array.merge_sorted_array_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Merge Sorted Array II":
                strings = getResources().getStringArray(R.array.merge_sorted_array_two_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Binary Search":
                strings = getResources().getStringArray(R.array.binary_search_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Search Insert Position":
                strings = getResources().getStringArray(R.array.search_insert_position_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Search for a Range":
                strings = getResources().getStringArray(R.array.search_for_a_range_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "First Bad Version":
                strings = getResources().getStringArray(R.array.first_bad_version_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Search a 2D Matrix":
                strings = getResources().getStringArray(R.array.search_a_2D_matrix_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Find Peak Element":
                strings = getResources().getStringArray(R.array.find_peak_element_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Search in Rotated Sorted Array":
                strings = getResources().getStringArray(R.array.search_in_rotated_sorted_array_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Find Minimum in Rotated Sorted Array":
                strings = getResources().getStringArray(R.array.find_minimum_in_rotated_sorted_array_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Search a 2D Matrix II":
                strings = getResources().getStringArray(R.array.search_a_2D_matrix_two_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Median of two Sorted Arrays":
                strings = getResources().getStringArray(R.array.median_of_two_sorted_arrays_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Sqrt x":
                strings = getResources().getStringArray(R.array.sqrt_x_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Wood Cut":
                strings = getResources().getStringArray(R.array.wood_cut_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Single Number":
                strings = getResources().getStringArray(R.array.single_number_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Single Number II":
                strings = getResources().getStringArray(R.array.single_number_two_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "O(1) Check Power of 2":
                strings = getResources().getStringArray(R.array.o_1_check_power_of_2_source_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Convert Integer A to Integer B":
                strings = getResources().getStringArray(R.array.convert_integer_a_to_integer_b_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Factorial Trailing Zeroes":
                strings = getResources().getStringArray(R.array.factorial_trailing_zeroes_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Remove Duplicates from Sorted List":
                strings = getResources().getStringArray(R.array.remove_duplicates_from_sorted_list_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Remove Duplicates from Sorted List II":
                strings = getResources().getStringArray(R.array.remove_duplicates_from_sorted_list_two_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Partition List":
                strings = getResources().getStringArray(R.array.partition_list_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Two Lists Sum":
                strings = getResources().getStringArray(R.array.two_lists_sum_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Two Lists Sum Advanced":
                strings = getResources().getStringArray(R.array.two_lists_sum_advanced_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Remove Nth Node From End of List":
                strings = getResources().getStringArray(R.array.remove_nth_node_from_end_of_list_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Linked List Cycle":
                strings = getResources().getStringArray(R.array.linked_list_cycle_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Linked List Cycle II":
                strings = getResources().getStringArray(R.array.linked_list_cycle_two_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Reverse Linked List":
                strings = getResources().getStringArray(R.array.reverse_linked_list_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Reverse Linked List II":
                strings = getResources().getStringArray(R.array.reverse_linked_list_two);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Merge Two Sorted Lists":
                strings = getResources().getStringArray(R.array.merge_two_sorted_lists);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Merge k Sorted Lists":
                strings = getResources().getStringArray(R.array.merge_k_sorted_lists);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Sort List":
                strings = getResources().getStringArray(R.array.sort_list_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Reorder List":
                strings = getResources().getStringArray(R.array.recorder_list_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Recover Rotated Sorted Array":
                strings = getResources().getStringArray(R.array.recover_rotated_sorted_array_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Rotate String":
                strings = getResources().getStringArray(R.array.rotate_string_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Reverse Words in a String":
                strings = getResources().getStringArray(R.array.reverse_words_in_a_string);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Binary Tree Preorder Traversal":
                strings = getResources().getStringArray(R.array.binary_tree_preorder_traversal_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Binary Tree Inorder Traversal":
                strings = getResources().getStringArray(R.array.binary_tree_inorder_traversal_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Binary Tree Postorder Traversal":
                strings = getResources().getStringArray(R.array.binary_tree_postorder_traversal_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Binary Tree Level Order Traversal":
                strings = getResources().getStringArray(R.array.binary_tree_level_order_traversal_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Maximum Depth of Binary Tree":
                strings = getResources().getStringArray(R.array.maximum_depth_of_binary_tree_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Balanced Binary Tree":
                strings = getResources().getStringArray(R.array.balanced_binary_tree_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Binary Tree Maximum Path Sum":
                strings = getResources().getStringArray(R.array.binary_tree_maximum_path_sum_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Lowest Common Ancestor":
                strings = getResources().getStringArray(R.array.lowest_common_ancestor_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Insert Node in a Binary Search Tree":
                strings = getResources().getStringArray(R.array.insert_node_in_a_binary_search_tree_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Validate Binary Search Tree":
                strings = getResources().getStringArray(R.array.validate_binary_search_tree_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Search Range in Binary Search Tree":
                strings = getResources().getStringArray(R.array.search_range_in_binary_search_tree_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Convert Sorted Array to Binary Search Tree":
                strings = getResources().getStringArray(R.array.convert_sorted_array_to_binary_search_tree_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Convert Sorted List to Binary Search Tree":
                strings = getResources().getStringArray(R.array.convert_sorted_list_to_binary_search_tree_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Binary Search Tree Iterator":
                strings = getResources().getStringArray(R.array.binary_search_tree_iterator_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Subsets":
                strings = getResources().getStringArray(R.array.subsets_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Permutation":
                strings = getResources().getStringArray(R.array.permutation_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Triangle":
                strings = getResources().getStringArray(R.array.triangle_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Backpack":
                strings = getResources().getStringArray(R.array.backpack_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Minimum Path Sum":
                strings = getResources().getStringArray(R.array.minimum_path_sum);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Unique Paths":
                strings = getResources().getStringArray(R.array.unique_paths_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Climbing Stairs":
                strings = getResources().getStringArray(R.array.climbing_stairs_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            case "Jump Game":
                strings = getResources().getStringArray(R.array.jump_game_);
                tvTitle.setText(strings[0]);
                tvAnswer.setText(strings[1]);
                break;
            default:
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
