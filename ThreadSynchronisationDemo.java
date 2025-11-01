package MultiThreading;


class Booking {
    int avl_tickets=10;
     synchronized void  book(int no_of_tickets){ // yaha synchronisation ki jaroorat hoti sirf method ke aage synchronised keyword likhna h
    
        if(no_of_tickets<  avl_tickets){
            System.out.println("tickets booked successfully");
            avl_tickets-=no_of_tickets;
            System.out.println("tickets left: "+ avl_tickets);
        }
        else {
            System.out.println("tickets not available");
            System.out.println("tickets left: "+ avl_tickets);
        }
    }
}
public class ThreadSynchronisationDemo extends Thread{

    static Booking b;
    int ticket;
    public ThreadSynchronisationDemo( int ticket){
        this.ticket=ticket;
    }
    public void run(){
        b.book(ticket);
    }
    public static void main(String[] args) {
        b=new Booking();
        ThreadSynchronisationDemo  t1 = new ThreadSynchronisationDemo (7);
        ThreadSynchronisationDemo  t2 = new ThreadSynchronisationDemo (8);
        t1.start();
        t2.start(); // dono book ho jaenge aise due to context switching and total ticket negative m dikhaega;
        //yaha synchronisation ki jaroorat hoti sirf method ke aage synchronised keyword likhna h
    }

}
