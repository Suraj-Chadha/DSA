package OOPS;
public class OOPSIntro{
    private static class Person{
        String name;
        int age;

        void sayHi(){
            if(this.age > 30){
                System.out.println("Hello I am "+this + " " + this + " life Sucks");
            }else{
                System.out.println("Hi dude my name is "+ this + " "+ this+  " life rocks dude");
            }
        }
    } 
    public static void main(String[] args){
        Person p1; // p1 is a reference to instance of class right now p1 is set to null by default
        p1 = new Person(); // new operator works on classes and creates an instance of classes in heap and returns a address of memory allocated
        p1.name="Suraj";
        p1.age=40;
        p1.sayHi();
        Person p2; // p2 is a reference
        p2 = new Person(); // new operator creates an instance of class
        p2.name = "pepcoding"; // name attribute is changed in the heap
        p2.age=4; // age attribut is changed in the heap
        p2.sayHi(); // sayHi() of p2 instance is called, "this" is passed to function sayHi which points to instance of the class
    }
}