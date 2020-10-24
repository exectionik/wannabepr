package com.appslab;

public class Main{
    public static String rps(String p1, String p2){
        String result;
        if (p1 == "rock" && p2== "paper" || p2 =="scissors" && p1=="paper" || p2=="rock" && p1=="scissors"){
            result = "p2 wins";
        }
        else if (p1 == p2){
            result = "tie";
        }
        else{
            result="p1 wins";
        }
        return  result;
    }


    public static void main(String arr[]) {
        System.out.println(rps("rock", "paper"));


    }



}

