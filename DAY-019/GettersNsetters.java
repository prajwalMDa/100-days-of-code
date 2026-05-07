public class GettersNsetters {
    public static void main(String[] args){

        Car mycar = new Car();
        mycar.Setcolor("orange");
        System.out.println(mycar.Getcolor());
        mycar.Settroque(300);
        System.out.println(mycar.Gettorque());
    }
}

class Car{
    private String color;
    private int torque;

    void Setcolor(String color){
        this.color = color;
    }

    String Getcolor(){
        return this.color;
    }

    void Settroque(int torque){
        this.torque = torque;
    }

    int Gettorque(){
        return this.torque;
    }
}