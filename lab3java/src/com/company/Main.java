package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        test t = new test() {
            @Override

            public double logika(double d1, double d2, double d3) {
                System.out.println("////////////////////////////////////////////////////////////////////////////////1");
                int x=0;
                if (d1>=0) x=x+1;
                else System.out.println("Число  d1 меньше нуля "+ d1);
                if (d2>=0) x=x+1;
                else System.out.println("Число d2 меньше нуля " + d2);
                if (d3>=0) x=x+1;
                else System.out.println("Число  d3 меньше нуля " + d3);

                System.out.println("Чисел больше нуля "+ x);
                System.out.println("");
                return 0;
            }

            @Override
            public void poka(int N) {
                System.out.println("////////////////////////////////////////////////////////////////////////////////2");
                int b = (N+"").length();
                for (int i=1; i<=b; i++) {
                    int n1=0;
                        if (N<0)  System.out.println("Число N меньше нуля ");
                        else if ((N % 10) > 0) { n1 = N%10; System.out.println(n1);}
                            else System.out.println(n1);
                            N=(N-n1)/10;


                }

            }

            @Override
            public void massivy(int size, double D) {
                System.out.println("////////////////////////////////////////////////////////////////////////////////3");
                int A[]= new int[100];
                System.out.println("Число D: "+D);
                System.out.println("Массив A : ");
                double min = 999999999;
                for (int idx = 1; idx <= size; idx++) {
                    A[idx] = (int) Math.floor(Math.random()*160 - 100);
                    System.out.println( A[idx]+" ");
                    double absDiff = Math.abs (Math.abs(A[idx]) - D);
                    if  (min > absDiff ) min = absDiff;
                }
                System.out.println("Минимальная разница: "+min);
            }
        };
        t.logika(-1,3,-2);
        t.poka(334567);
        t.massivy(3,10);
    }
}
