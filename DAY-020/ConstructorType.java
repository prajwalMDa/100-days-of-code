public class ConstructorType {     
    public static void main(String[] args){     
     
        School s1 = new School();    
        School s2 = new School("prajwal"); 
        School s3 = new School(19);
        System.out.println(s3.Getname());
        
    }     
}     
     
class School{     
    private int Class;     
    private int rollno;     
    private String name;     
     
    School(String name){     
        this.name = name;     
    }
    String Getname(){
        return this.name;
    }     
     
    School(int Class){     
        this.Class = Class;     
    }     
     
    School() {     
        System.out.println("constructor called"); 
        System.out.println("ypp");    
    }     
     
         
}     
     