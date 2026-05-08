
public class Multiple {
    public static void main(String[] args) {
        Human h = new Human();
        h.veg();
        h.nonveg();
    }
}

interface Herbiore{
    void veg();
}

interface Carniore{
    void nonveg();
}

class Human implements Herbiore, Carniore{
    public void veg(){
        System.out.println("eats veg");
    }
    public void nonveg(){
        System.out.println("eats nonveg");
    }
}