public class OnlineStudent extends
      Student{
    String platform;
    int internetspeed;

    public OnlineStudent(String Name, String Department, int rollNo, int Age,  String platform,  int internetspeed)

    {
      super(Name,Department,rollNo,Age); //parent class constructor ko invoke from child class
     this.platform= platform;
     this.internetspeed=internetspeed;

    }
    public OnlineStudent(){

    }
    public void payFee() {
        // super.payFee() ye likhne se parent class payfee function bhi call hoga jab jab method overloading se ye wala payfee call karenge
        System.out.println("the student " + name +  "paid the tution fee+platform fee of the platform "+platform);

    }

}