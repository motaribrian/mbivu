/*
There is a circle of red and blue tiles. You are given an array of integers colors and an integer k. The color of tile i is represented by colors[i]:

        colors[i] == 0 means that tile i is red.
        colors[i] == 1 means that tile i is blue.

        An alternating group is every k contiguous tiles in the circle with alternating colors (each tile in the group except the first and last one has a different color from its left and right tiles).

        Return the number of alternating groups.

        Note that since colors represents a circle, the first and the last tiles are considered to be next to each other.
*/


package org.codewithmotari.alternatinggroups;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.LinkedList;

@SpringBootApplication
public class AlternatingGroups {

    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;
        int validSize = 1;

        for (int i = 1; i < n + k - 1; i++)
        {
            if (colors[i % n] != colors[(i - 1) % n])
            {
                validSize++;
                if (validSize >= k)
                {
                    count++;
                }
            }
            else
            {
                validSize = 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        SpringApplication.run(AlternatingGroups.class, args);
        AlternatingGroups a=new AlternatingGroups();
        int []colors={0,0,0,1,0,1,0,1,0,1};
        int ab=a.numberOfAlternatingGroups(colors,2);
        System.out.println(ab);
    }

}
