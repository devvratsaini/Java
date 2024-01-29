package Session_3;

//POJO outer class
class OuterStatic {

 private int outerNonStaticVariable = 5;
 private static int outerStaticVariable = 10;

 // inner class
 static class Inner {

     // function to display a message
     public void display() {
         System.out.println("Method of inner class called.");
         System.out.println("Value of outerNonStaticVariable cannot be accessed");
         System.out.println("Value of outerStaticVariable: " + outerStaticVariable);
     }
 }

 // function to use static Inner class
 void useStaticInnerClass() {
     Inner i1 = new Inner();
     i1.display();
 }
}

public class StaticInnerClass {

 // main method
 public static void main(String[] args) {

     OuterStatic outerObj1 = new OuterStatic();
     outerObj1.useStaticInnerClass();

     // creating an instance of the static nested class directly (common practice)
     OuterStatic.Inner innerObj2 = new OuterStatic.Inner();
     innerObj2.display();
 }
}
