
public class ClassAndObj {
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setcolor("orange");
        // p1.color = "blue";
        System.out.println(p1.color);

        p1.setsize(2);
        // p1.size = 3;
        System.out.println(p1.size);
    }
}

class Pen{
    String color;
    int size;
    
    void setcolor(String newcolor){
        color = newcolor;
     
    }

    void setsize(int newsize){
        size = newsize;

    }
}
