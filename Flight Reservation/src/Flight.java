
public class Flight {
  int fno= 9901;
  String airline;
  int seatbooked=0;
  int capacity=5;
  int seatavailable=capacity-seatbooked;
  
  public int getAvailabilty() {
	  return seatavailable;
  }

public int getFno() {
	return fno;
}

public void setFno(int fno) {
	this.fno = fno;
}

public String getAirline() {
	return airline;
}

public void setAirline(String airline) {
	this.airline = airline;
}

public int getSeatbooked() {
	return seatbooked;
}

public void setSeatbooked(int seatbooked) {
	this.seatbooked = seatbooked;
}

public int getCapacity() {
	return capacity;
}

public void setCapacity(int capacity) {
	this.capacity = capacity;
}

public int getSeatavailable() {
	return seatavailable;
}

public void setSeatavailable(int seatavailable) {
	this.seatavailable = seatavailable;
}

}
