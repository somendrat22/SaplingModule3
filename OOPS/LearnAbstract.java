public class LearnAbstract {
    
    static abstract class NewClass{ // abstract class 
        // Abstact classes can contain abstract as well non abstract method.
        // You can make abstract classes static but can't make abstract function as static 
        abstract void newFun(); // Abstract functions are always empty we don't need to write impl;
        // If your function is of abstract type then you can't make it private 
        // You can't make an abstract function static.
    }
    public static void main(String[] args) {
        // Enter Your Code Here
        NewClass n = new NewClass(); // You can't create object of an abstract class 
    }
}
