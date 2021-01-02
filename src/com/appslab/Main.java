package com.appslab;
import java.lang.*;

public class Main{
    public static int diffrnc(int[]m_minus){
        int min = m_minus[0];
        int max= m_minus[0];

            for(int i=1;i< m_minus.length ;i++) {
                if (min > m_minus[i]) {
                    min = m_minus[i];
                } else if (max < m_minus[i]) {
                    max = m_minus[i];
                }
            }

        return max-min;

        }



    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        System.out.println(diffrnc(arr));
    }



}

