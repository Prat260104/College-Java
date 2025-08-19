//LECTURE 3

public class Construct {
   
    int RollNumber;
    String Name;
    String Department;
    char Section;
    static String CollegeName = "IIT DHOLAKPUR";
    //final keyword matlab ab iski value change nhi kar sakte na final method ko override kar sakte but can be overloaded 
    final String role = "student";

    //empty constructor
    Construct() {
        this.RollNumber = 0;
        this.Name = "Unknown";
        this.Department = "Not Assigned";
        this.Section = '-';
       
    }
    
    //parameterized constructor
    Construct(int rno, String naam, String dept, char sec) {
        this.RollNumber = rno;
        this.Name = naam;
        this.Department = dept;
        this.Section = sec;
    }
    
    //copy constructor
    Construct(Construct other) {
        this.RollNumber = other.RollNumber;
        this.Name = other.Name;
        this.Department = other.Department;
        this.Section = other.Section;
    }

    public void studying(int hours) {
        System.out.println(this.Name + " is studying " + hours + " hours in " + CollegeName + " and is "+ role);
    }

    public void eating() {
        System.out.println(this.Name + " is eating");
    }

    public void playing() {
        System.out.println(this.Name + " is playing"); 
    }

    public static void main(String args[]) {
       Construct student1 = new Construct(32,"prateek","ai",'c');
        student1.studying(24);
        student1.eating();
        student1.playing();

        Construct student2 = new Construct();
        student2.studying(0);
        student2.eating();
        student2.playing();

        //here we changed college name that is static variable from here value of collegename will be KIET for everyone
        Construct.CollegeName="KIET";

        Construct student3 = new Construct(student1);
        student3.studying(12);
        student3.eating();
        student3.playing();
    }
}


