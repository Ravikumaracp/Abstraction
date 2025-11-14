//Abstaction in Java.
//hiding complex implementation and showing only fuctionallty
abstract class Car{ //abstract class.
    //if method is abstract class should be abstact class
    //inside abstaract class we can create non-abstract method and abstract methos also.
    public abstract void drive();
    
    public void playmusic(){
        System.out.println("Music is playing...");
    }
}
class WagonR extends Car{ //concurrent class
    //we need to implement parent class abstract method in concurrent child class.
    public void drive(){
        System.out.println("Driving...");
        //if here if don't implement abstract method it will throw compile time error.
    }
    
}
//we can create more concurrent classes from abstract class.
class Main{
    public static void main(String[] args){
        //we can't able create object to abstarct class.
        Car obj=new WangonR();
        obj.drive();
        obj.playmusic();
    }
}