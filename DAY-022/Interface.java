

public class Interface {
    public static void main(String[] args) {
        Queen q  = new Queen();
        q.move();

        Elephant e = new Elephant();
        e.move();

        Camel c = new Camel();
        c.move();
    }
}

interface Chess{
    void move();
}

class Elephant implements Chess{
    public void move(){
        System.out.println("left , right, forward , backward");
    }
}

class Queen implements Chess{
    public void move(){
        System.out.println("left, right, forward , backward, all diagonals with all directions");
    }
}

class Camel implements Chess{
    public void move(){
        System.out.println("all diagonals with all directorns");
    }
}
