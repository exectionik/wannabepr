package com.appslab;




public class Main {


        public static void main(String[] args) {

            System.out.println(fciaaa(2, 3, 4));
        }
            public static boolean fciaaa(int a, int b, int c){
                int eqe = 0;
                boolean pepe = false;
                if ((a + b > c) && (a + c > b) && (b + c > a))
                    eqe++;
                if ((a*a + b*b == c*c) || (b*b + c*c == a*a) || (c*c + a*a == b*b))
                    eqe++;
                if (eqe > 0)
                    pepe = true;
                return pepe;



            }

    }

















