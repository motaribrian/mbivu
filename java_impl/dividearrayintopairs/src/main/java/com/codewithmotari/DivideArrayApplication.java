/*
 * You are given an integer array nums consisting of 2 * n integers.
 * You need to divide nums into n pairs such that:
 * Each element belongs to exactly one pair.
 * The elements present in a pair are equal.
 * Return true if nums can be divided into n pairs, otherwise return false.
*/

/**********************************************************************************/
package com.codewithmotari;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DivideArrayApplication {


    public boolean divideArray(int[] nums) {
        if(nums.length%2!=0){
            return false;
        }
        Map<Integer,Integer> valueOccurence=new HashMap<>();
            for (int i = 0; i < nums.length; i++) {            
            }
            return false;
        
        
        
    }



    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}