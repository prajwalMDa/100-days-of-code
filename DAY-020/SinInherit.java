public class SinInherit {
    public static void main(String[] args){

        //single level inheritence
        Car  Hyundai = new Supercar();
        Hyundai.color = "white";
        System.out.println( Hyundai.color);
        Hyundai.move();
        Hyundai.fuel();
        Hyundai.music();
        Hyundai.ac();

        //multilevel inheritence
        Supercar lambo = new Supercar();
        lambo.color = "red";
        System.out.println(lambo.color);
        lambo.move();
        lambo.fuel();
        lambo.music();
        lambo.ac();
        lambo.sound();
        lambo.door();
    }

}

class Vehicle{
    int tire;
    String color;

    void move(){
        System.out.println("moves one place to another");
    }

    void fuel(){
        System.out.println("needs fuel");
    }
}

class Car extends Vehicle {
    void music(){
        System.out.println("has music syatem");
    }

    void ac(){
        System.out.println("has ac");
    }
}

class Supercar extends Car{
    void door(){
        System.out.println("has scissor doors");
    }
    void sound(){
        System.out.println("louder sound");
    }
}
