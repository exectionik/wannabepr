package com.appslab;

public class Main{
    public static int sumbudget(Workers[] arr){
        int i = 0;
        for(Workers worker: arr){
            i = i+ worker.getBudget();

        }

        return i;

    }




    public static void main(String[] args) {
        Workers[] arr;

        arr = new Workers[3];
        arr[0] = new Workers("Fero", 18, 20000);
        arr[1] = new Workers("Jozik", 22, 50000);
        arr[2] = new Workers("Martin", 41, 45000);


        System.out.println(sumbudget(arr));
    }



}

