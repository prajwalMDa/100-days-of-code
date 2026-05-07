public class MethodOverloading {
    public static void main(String[] args){
        Maths m2 = new Maths();
        m2.add(2, 3);
        m2.add(2.4f, 9.5f);
        m2.add(12, 23, 34);


    }
}


class Maths{
    void add(int a, int b){
        System.out.println("2 int values as parameters");
    }

    void add(float a, float b){
        System.out.println("2 flaot values as parameters");
    }

    void add(int a, int b, int c){
        System.out.println("3 int values as parameters");
    }
}


