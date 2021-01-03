package com.appslab;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static int war(int[]companions){
        int even=0;
        int uneve=0;
        int vysledok=0;
        for(int i = 0;i< companions.length;i++){
            if (companions[i]%2==0){
                even+=companions[i];
            }
            if (companions[i]%2!=0){
                uneve+=companions[i];
            }
        }
       if (even-uneve>0){
           vysledok=even-uneve;
       }
       else vysledok=uneve-even;
        return vysledok ;
        }


    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        System.out.println(war(arr));
    }



}

