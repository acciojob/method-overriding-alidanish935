package com.driver;

public class Main {
  public static void main(String[] args) {
    B b = new B();
    //b.meth();
    System.out.println(b.meth());
  }
}
class A{
    String meth(){
        return "Danish";
    }
}
class B extends A{
  String meth(){
    return "Method is overridden in Extended class B";
  }
}