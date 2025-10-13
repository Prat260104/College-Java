//test class jisme sari class objects methods call karenge

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Rohan", "AI", 60, 13);
        Student s2 = new Student("prateek", "AI", 32, 20);
        Student s3 = new Student("rahul", "AI", 6, 19);
        System.out.println("The name of the student 1 is " + s1.name);
         System.out.println("The name of the student 2 is " + s2.name);
          System.out.println("The name of the student 3 is " + s3.name);

        RegularStudent rs = new RegularStudent("nobita", "AI", 38, 90, 19, "h506");
        OnlineStudent os=new OnlineStudent("tiwari","cse",1,20,"zoom",300);
        HostelStudent hs = new HostelStudent("anonymous", "AIml;", 333, 9, 90, "h606","cvraman",413);
        rs.displayInfo();
        rs.payFee(); //method overriding 
        s1.payFee();
        rs.displayInfo(); //method overriding 
        s2.displayInfo();
        os.payFee();//method overriding 
        hs.payFee();//method overriding 
    }


}