package com.appslab;




public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Ferek", 10, 2548710, "Upsa 89, Zilina 80120");
        Student s2 = new Student("Durmek", 11, 252201, "Ubuty 87, Poprad 020044" );

        System.out.println(s1.getName() + ", " + s1.getNumberofs() + ", " + s1.getsNumber() + ", " + s1.getAddress());
        System.out.println(s2.getName() + ", " + s2.getNumberofs() + ", " + s2.getsNumber() + ", " + s2.getAddress());
    }
}
