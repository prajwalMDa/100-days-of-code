public class Constructor {
    public static void main(String[] args){
        Class chem = new Class("prajwal");
        // System.out.println(chem.name);
        // System.out.println(chem.roll);
        chem.Setroll(12);
        System.out.println(chem.Getroll());

    }
}

class Class{
    private String name;
    private int roll;

    
    Class(String name) {
        this.name = name;
        System.out.println("this is a constructor");
    }

    public void Setroll(int newroll){
        this.roll = newroll;
    }

    public int Getroll(){
        return this.roll;
    }

    
}