public class HybridInheritence {
    public static void main(String[] args){
        System.out.println("--tuna--");
        Tuna t = new Tuna();
        t.breath();
        t.swim();
        t.group();
        System.out.println();
        System.out.println("--sharko--");
        Shark sharko = new Shark();
        sharko.breath();
        sharko.swim();
        sharko.teeth();
        System.out.println();
        System.out.println("--peacock--");
        Peacock p = new Peacock();
        p.breath();
        p.feathers();
        p.fly();
        System.out.println();
        System.out.println("--rockey--");
        Dog rocky = new Dog();
        rocky.bark();
        rocky.breath();
        System.out.println();
        System.out.println("cat");
        Cat meow = new Cat();
        meow.breath();
        meow.meow();
        System.out.println();
        System.out.println("--prajwal--");
        Humans prajwal = new Humans();
        prajwal.breath();
        prajwal.speak();
    }
}

class Animal{

    void breath(){
        System.out.println("breath");
    }

}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

class Tuna extends Fish{
    void group(){
        System.out.println("always be in group");
    }
}

class Shark extends Fish{
    void teeth(){
        System.out.println("Has many teeth");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("it fly");
    }
}

class Peacock extends Bird{
    void feathers(){
        System.out.println("has beautiful feathers");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("it walk");
    }
}

class Dog extends Mammal{
    void bark(){
        System.out.println("it bark");
    }
}

class Cat extends Mammal{
    void meow(){
        System.out.println("it meows");
    }
}

class Humans extends Mammal{
    void speak(){
        System.out.println("code");
    }
}

