/*
Implement class AdvanceTicket to represent tickets purchased in advance.
An advance ticket is constructed with a ticket number and with the number of days
in advance that the ticket was purchased. Advance tickets purchased 10 or more
days before the event cost $30, and advance tickets purchased fewer than 10 days
before the event cost $40.
*/
public class AdvanceTicket extends Ticket {
  //initialize attributes
  private int numberOfDays;
  private double price;

  //initializing constructor
  public AdvanceTicket(int ticketNumber, int numberOfDays){
    super(ticketNumber);
    this.numberOfDays = numberOfDays;

    if (numberOfDays >= 10){
      this.price = 30.0;
    }
    else{
      this.price = 40.0;
    }
  }

  //getter method
  public double getPrice(){
    return this.price;
  }

  //setter method
  public void setPrice(double price){
    this.price = price;
    //System.out.println("ATsetting price to: " + this.getPrice());
  }

}
