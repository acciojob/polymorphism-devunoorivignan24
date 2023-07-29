package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p=new Product();
        int x=4,y=5,z=6;
        double x1=5.0,x2=6.0;
        int a=p.product(x,y);
        int b=p.product(x,y,z);
        double c=p.product(x1,x2);
    }
    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
}
