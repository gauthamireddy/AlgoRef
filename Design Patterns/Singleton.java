//returns single instance of a class - creational
//static member
//private constructor
//static method that refers back to the static member

public class Singleton{
    public static void main(String args[]){
     Abc obj1 = Abc.getInstance();
    }
}

Class Abc {
     static Abc obj = new Abc();
     private Abc(){
        }
     public static Abc getInstance(){
        return obj;
     }
}