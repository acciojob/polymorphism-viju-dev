package com.driver;

public class Main {
    public static void main(String[] args) {
        Product P = new Product();
        P.product(10,20);
        P.product(10,20,30);
        P.product(10.5,20.5);
    }

    public static class  Product{
        public int product(int x, int y) {
        return X*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
}
