
public class Ticket {
  int pnr=123;
  String departure;
  String arrival;
  int seatno;
  int price = 4100;
  boolean status;
  String s;
  int duration= 2;
  
  
  public void display() {
	  System.out.println("-------------------------------------");
	  System.out.println(" PNR: "+pnr);
	  System.out.println(" FROM: "+departure+"  TO: "+arrival);
	  System.out.println(" Name: "+Passenger.name+"  PHONE: "+Passenger.phone);
	  System.out.println(" Type of Ticket: "+Passenger.type_of_ticket+"  PRICE: "+price);
	  System.out.println(" Duration: "+duration+" hours.");
	  System.out.println("-------------------------------------");  
	  
  }


public int getPnr() {
	return pnr;
}


public void setPnr(int pnr) {
	this.pnr = pnr;
}


public String getDeparture() {
	return departure;
}


public void setDeparture(String departure) {
	this.departure = departure;
}


public String getArrival() {
	return arrival;
}


public void setArrival(String arrival) {
	this.arrival = arrival;
}


public int getSeatno() {
	return seatno;
}


public void setSeatno(int seatno) {
	this.seatno = seatno;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}


public boolean isStatus() {
	return status;
}


public void setStatus(boolean status) {
	this.status = status;
}


public int getDuration() {
	return duration;
}


public void setDuration(int duration) {
	this.duration = duration;
}
}
