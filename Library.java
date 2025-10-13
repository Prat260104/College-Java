package Encapsulation;

public class Library {
  
    final private int maxbooks=5;
    private int borrowed;

    public int getborrowed(){
      return borrowed;
    }

    public void borrowedbooks(){
        if(borrowed<maxbooks){borrowed++;
        System.out.println("updated borrow count  to "+ borrowed);}
        else {System.out.println("limit reached");}
    }
    public void  returnborrowed(){
        if(borrowed>0){
            borrowed--;
            System.out.println("updated return book count to "+borrowed);
        }else{
        System.out.println("no books left to return");
        }
    }
    

}
