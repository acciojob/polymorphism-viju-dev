package com.driver;

public class Main {
    public static void main(String[] args) {
        Product P = new Product();
        P.product(1,2);
        P.product(1,2,3);
        P.product(1,2);
    }

    static class  Product{
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