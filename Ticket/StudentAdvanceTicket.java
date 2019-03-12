/*
Implement class StudentAdvanceTicket to represent tickets purchased in advance by students.
A student advance ticket is constructed with a ticket number and with the number of
days in advance that the ticket was purchased. Student advance tickets cost half the
normal advance ticket price. A student advance ticket is printed with this format:
"Number: 17,Price: 15.0 (ID required)".
*/
public class StudentAdvanceTicket extends AdvanceTicket {

  //initialize constructor with parent class
  public StudentAdvanceTicket(int ticketNumber, int numberOfDays){
    super(ticketNumber,numberOfDays);
    setPrice(super.getPrice()/2.0);
  }

  //setter method
  // public void setPrice(double price){
  //   super.setPrice(price);
  //   System.out.println("SATsetting price to: " + this.getPrice());
  // }

  public String toString(){
    return super.toString() + " (ID required)";
  }

}
