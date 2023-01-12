package com.driver;

public class Main {
  public static void main(String[] args) {
        Product p = new Product();
    // now calling all three methods
        //int method with two actual parameters
        p.product(768,2500);
        //int method with three parameters
        p.product(768,2500, 1800);
        //double method 
        p.product(7.98,2.25);

    }
    public static class Product{
        //method 1 with two formal parameters
        public int product(int x, int y){
            return 35;
        }
        //method 2 with same name but having three formal parameters
        public int product(int x, int y, int z){
            return 480;
        }
        //method 3 with same name but having different return type
        public double product(double x, double y){
            return 40.32;
        }
    }

}


