package com.example.features.annonclass;

public class Demo {


  public static void main(String[] args) {

    // we can either create annon statement from class or interface.
    // extends from class and creates annon statement
    // usually we create sepearate class and extend/implement the class in order to use the methods.
    // instead of sepearate class, we can create definitions here itself.
    SampleAnnonClass annonVar1 = new SampleAnnonClass(){
      public String greeting(){
        return "hello from parent sss class";
      }
    };

    var response = annonVar1.greeting1();
    System.out.println(response);

    // extends from interface and creates annon statement
    SampleAnnonInterface sampleAnnonInterface = new SampleAnnonInterface() {
      @Override
      public String welcome1() {
        return "from annoth interface welcome1";
      }
    };

    System.out.println(sampleAnnonInterface.welcome1());
  }

}
