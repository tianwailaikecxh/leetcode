package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Problem496 {
    public static void main(String[] args){

    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] result = new int[len1];
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map= new HashMap<>();
        for(int i = 0;i<len2;i++){
            while(!stack.empty() && nums2[i]>stack.peek()){
                map.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(),-1);
        }
        for(int i = 0;i<len1;i++){
            result[i] = map.get(nums1[i]);
        }
        return result;


    }
}
