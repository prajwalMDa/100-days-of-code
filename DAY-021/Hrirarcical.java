public class Hrirarcical {
    public static void main(String[] args){
        Bird sparrow = new Bird();
        sparrow.eat();
        sparrow.fly();

        Dog lab = new Dog();
        lab.eat();
        lab.teeth();
    }
}

class Animal{
    void eat(){
        System.out.println("eats food");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("bird fly");
    }
}

class Dog extends Animal{
    void teeth(){
        System.out.println("has teeth");
    }
}
