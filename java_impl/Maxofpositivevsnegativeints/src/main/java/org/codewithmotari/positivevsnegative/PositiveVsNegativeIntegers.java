package org.codewithmotari.positivevsnegative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PositiveVsNegativeIntegers {

    int maximumCount(int[] nums) {
        int n=nums.length;
        int positive=0;
        int negative=0;
        for (int i=0;i<n;i++){
            if (nums[i]<0){
                negative++;
            }
            else if (nums[i]>0){
                positive++;
            }else
            System.out.println(nums[i]+"is actually 0");
        }
        return positive>negative ? positive :negative;

    }


    public static void main(String[] args) {
        SpringApplication.run(PositiveVsNegativeIntegers.class, args);

        //Running This Program
        PositiveVsNegativeIntegers p=new PositiveVsNegativeIntegers();
        int[] sample={-1,0,2,6,7,9};
        System.out.println(maximumCount(sample));
        //output is 4
    }

}
