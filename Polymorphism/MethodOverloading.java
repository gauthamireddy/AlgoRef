//overloading
Class Overload {
        void demo(int a){
        System.out.println("a is: " + a)
        }

        void demo(int a, int b){
        System.out.println("a and b are: " + a + "," + b +);
        }

        void demo( double a){
        System.out.println("double a: " + a);
        return a *a;
        }
}

Public Class MethodOverloading {
        public static void main(String[] args){
            Overload obj = new Overload();
        obj.demo(10);
        obj.demo(10,20);
        double result;
       result =  obj.demo(5.5);
        System.out.println("Result is " + result)

         }
}


//overriding
public class BaseClass {
    public void MethodToOverride() {
        System.out.println("Im from the base class");
    }
}

public class DerivedClass extends BaseClass {
    public void MethodToOverride() {
        System.out.println("Im from the derived class");
    }
}

public class Test{
    public static void main(String args[]){
        BaseClass obj1 = new BaseClass();
        DerivedClass obj2 = new DerivedClass();

        obj1.MethodToOverride();
        obj2.MethodToOverride();
    }
}

//superkey - override
When invoking a superclass version of an overridden method the super keyword is used.

public class Vehicle{
    public void move(){
        System.out.println("Move the vehicle");
    }
}

public class Car extends Vehicle {
    public void move(){
        super.move();
        System.out.println("Move the car");
    }
}

public class SuperExample {
    public static void main(String[] args){
        Vehicle bmw = new Car();
        bmw.move();
    }
}

