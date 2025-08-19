public class Student {
    int RollNumber ;
    String Name;
    String Department;
    char Section;
    static String CollegeName = "IIT DHOLAKPUR"; 

    Student(int rno,String naam,String dept,char sec){
        this.RollNumber=rno;
        this.Name=naam;
        this.Department=dept;
        this.Section=sec;
    }
    public void studying(int hours){
        System.out.println(this.Name + " is studying " + hours + " hours in " + CollegeName);
    }
    public void eating(){
        System.out.println(this.Name + " is eating");
    }
     public void playing(){
        System.out.println(this.Name + " is playing");
    }
    public static void main(String args[]){
    Student student1 = new Student(32,"prateek","ai",'c');
    student1.studying(24);
    student1.eating();
    student1.playing();
    Student student2 = new Student(1,"prateekkadost","cse",'e');
    student2.studying(0);
    student2.eating();
    student2.playing();
    }
   
}


