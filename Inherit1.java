//inheritance Lecture 4 child class and parent class


public class Inherit1 extends Construct {
    int libraryid;

    public Inherit1(){

    }
    public Inherit1(int id,String  Name,int RollNumber,String dept, char sec){
        super(RollNumber, Name,dept,sec);
        this.libraryid=id;
    }

    public void showid(){
        System.out.println("Student library id is "+ libraryid);
    }
    public static void main(String[] args){
        Inherit1 obj = new Inherit1(32,"rahul",2428,"AI",'c');
        System.out.println("Student "+ obj.Name + " roll no "+  obj.RollNumber);
        obj.showid();
        obj.studying(3);
        
    }
}
