public class Multiple {
    public static void main(String[] args){
        Bat batman = new Bat();
        batman.eat();
        batman.fly();
        batman.hunt();
    }

}

class Animal{
    void eat(){
        System.out.println("eats food");
    }
}

interface Bird{
    void fly();
}

interface Hunt{
    void hunt();
}

class Bat extends Animal implements Hunt, Bird{
    public void fly(){
        System.out.println("it fly");
    }

    public void hunt(){
        System.out.println("it hunts");
    }
}

