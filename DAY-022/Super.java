

public class Super {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Car c = new Car();
        
        System.out.println(c.fuel);

    }
}

class Vehicle{
    String fuel;
    Vehicle() {
        System.out.println("vehicle constructor called");
    }
}

class Car extends Vehicle{
    Car(){
        super.fuel = "fuel";
        // super();
        System.out.println("Car constructor called");
    }
}
