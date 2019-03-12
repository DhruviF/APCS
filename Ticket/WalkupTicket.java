/*
Implement class WalkupTicket to represent a walk-up event ticket.
Walk-up tickets are also constructed by number, and they have a price of $50
*/
public class WalkupTicket extends Ticket {

	//initialize attribute
  private double price;

  //initializing constructor
  public WalkupTicket (int ticketNumber){
    super(ticketNumber);
    this.price = 50.0;
  }

  //getter method
  public double getPrice(){
    return price;
  }
}
