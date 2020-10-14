package com.appslab;
import java.util.Arrays;

public class Main {

    public static int[] numbs(){

        int[] ar = {5,6,9,8};
        return ar;

        }


    public static void main(String[] args) {
        int[] arr=numbs();
        for (int i = 0; i< arr.length;i++){
            System.out.println(arr[i] + " " + arr[i] * arr.length);
        }

    }


    }

















