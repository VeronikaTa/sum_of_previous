package com.epam.training.student_veronika_tarasova.sum_of_previous.src.main.java.com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){
        boolean[] sumPrevious = new boolean[array.length];

        for(int i = 2; i < array.length; i++){
            if(array[i] == (array[i-2] + array[i-1])){
                sumPrevious[i] = true;
            }
            else{
                sumPrevious[i] = false;
            }
        }

        return sumPrevious;
//        throw new UnsupportedOperationException();
    }
}
