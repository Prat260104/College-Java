
//inherit student class



public class RegularStudent extends Student {
    int attendance_per;
    String class_room;
 //values parent class ki directly accessible h 
    public RegularStudent(String Name, String Department, int rollNo, int Age, int attendance_per, String class_room) {
        super(Name,Department,rollNo,Age); //parent class constructor ko invoke from child class
        this.attendance_per = attendance_per;
        this.class_room = class_room;


    }


    public RegularStudent() {

    }
    public void submitassign(){
        System.out.println( name+ " HAS submitted his assignment in hard copy");
    }

    public void payFee() {
        // super.payFee() ye likhne se parent class payfee function bhi call hoga jab jab method overloading se ye wala payfee call karenge
        System.out.println("the student " + name + " in classroom " +class_room + "paid the tution fee+library fee+lab fee");

    }
    //same mthod name as parent class to method overrride
    public void displayInfo() {
        System.out.println("The student name is " + name + ", age is " + age + ", roll No is " + rollNo + " and department is " + department + " attendance is "+ attendance_per+ " classroom is "+ class_room);
    }


}