

public class Student {
    public String name;
    protected String department;
    int rollNo;
    public int age;

    static String CollegeName = "KIET";//static variable iski value sabke liye same hogi

    //parameteried constructor
    public Student(String name, String depart, int rollNo, int age) {
        this.name = name;
        this.department = depart;
        this.rollNo = rollNo;
        this.age = age;
    }
// default constructor
    public Student() {
        this.name = null;
        this.department = null;
        this.rollNo = 0;
        this.age = 0;
    }
    //copy constructor
    public Student(Student obj) {
        this.name = obj.name;
        this.department =obj.department;
        this.rollNo = obj.rollNo;
        this.age = obj.age;
    }

    public void studying(int no_of_hours) {
        System.out.println("The student " + name + " is studying for " + no_of_hours + ".");
    }

    public void readAndWrite() {
        System.out.println("The student can read and write.");
    }

    public void displayInfo() {
        System.out.println("The student name is " + name + ", age is " + age + ", roll No is " + rollNo + " and department is " + department + ".");
    }

    public void payFee() {
        System.out.println("The studenet " + name + " paid the tution Fee");
    }

    public static void main(String[] args) {
        // Using parameterized constructor
        Student student1 = new Student("Swayam_Srivastava", "CSE-AI", 258, 20);
        student1.displayInfo();

        // Using default constructor
        Student student2 = new Student();
        student2.name = "Nobita";
        student2.age = 19;
        student2.department = "CSE-AI";
        student2.rollNo = 25;
        student2.displayInfo();

        // Static variable example
        System.out.println("CollegeName is " + Student.CollegeName);
        Student.CollegeName = "IIT GZB";
        System.out.println("CollegeName after change: " + Student.CollegeName);
    }
}