package com.appslab;




public class Main {


        public static void main(String[] args) {

            System.out.println(fciaaa(3, 3, 3));
        }
            public static int fciaaa(int a, int b, int c){
                int eqe = 1;
                if (a == b)
                    eqe++;
                if (a == c)
                    eqe++;
                if (c == b)
                    eqe++;
                if (a == b && a == c && b == c)
                    eqe--;
                return eqe;



            }

    }

















