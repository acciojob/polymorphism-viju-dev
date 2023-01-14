package com.driver;

public class Main {
    public static void main(String[] args) {
        Product P = new Product();
        System.out.println( P.product(1,2));
        System.out.println(P.product(1,2,3));
        System.out.println(P.product(1,2));
    }

    public static class  Product{
        public int product(int x, int y) {
        return 0;
        }

        public int product(int x, int y, int z) {
            return 0;
        }
        public double product(double x, double y) {
            return 0;
        }
    }
}