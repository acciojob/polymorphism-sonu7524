package com.driver;

public class Main {
  public static void main(String[] args) {
        Product p = new Product();
        //int method with two actual parameters
        p.product(768,2500);
        //int method with three parameters
        p.product(768,2500, 1800);
        //double method 
        p.product(7.98,2.25);

    }

    static class Product{
        public int product(int x, int y){
            return x-y;
        }
        public int product(int x, int y, int z){
            return x+y+z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }
}
