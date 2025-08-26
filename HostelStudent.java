

public class HostelStudent extends
        RegularStudent {
    String hostelName;
    int roomNo;

    public HostelStudent(String Name, String Department, int rollNo, int Age, int attendancePer, String classRoom, String hostelName, int room_no)

    {
      super(Name,Department,rollNo,Age, attendancePer,classRoom);
      this.hostelName=hostelName;
      this.roomNo=room_no;

    }
     public void payFee() {
        // super.payFee() ye likhne se parent class payfee function bhi call hoga jab jab method overloading se ye wala payfee call karenge
        System.out.println("the student " + name + " in classroom " +class_room + "paid the tution fee+hostel fee+lab fee for hostel" + hostelName + " live in room " + roomNo);

    }

}