public class MethodOverriding {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.eat();
    }
}

class Animals{
    void eat(){
        System.out.println("Eats anything");
    }
}

class Cow extends Animals{
    @Override
    void eat(){
        System.out.println("Eat grass");
    }
}
