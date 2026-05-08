public class Static {
    public static void main(String[] args) {
        Bike a = new Bike();
        a.setBrand("tvs");
        a.setFuel("petrol"); 

        Bike b = new Bike();
        b.setBrand("splender");
        
        Bike c = new Bike();
        c.setBrand("gt");


        System.out.println(a.getBrand());
        System.out.println(a.getFuel());

        System.out.println(b.getBrand());
        System.out.println(b.getFuel());

        System.out.println(c.getBrand());
        System.out.println(c.getFuel());
    }
}

class Bike{
    private String Brand;
    private static String Fuel;

    void setBrand(String newBrand) {
        this.Brand = newBrand;
    }

    String getBrand() {
        return this.Brand;
    }



    void setFuel(String newFuel) {
        this.Fuel = newFuel;
    }

    String getFuel() {
        return this.Fuel;
    }
}
