public class Reservation {
  String partyName;              //party's name that the reservation is for
  int guestCount;          //number of guests in that party
  int restaurantCapacity;          //seating capacity available at the restaurant
  boolean isRestaurantOpen;      //boolean for whether restaurant is open or not
  boolean isConfirmed;          //boolean for confirmed or unconfirmed reservation


  //Reservation constructor with parameters
  public Reservation(String name, int count, int capacity, boolean open) {

    System.out.println("-----------------------------------------");
    System.out.println("Reservation for: " + name);     //prints name of the reserving party

    //if the number of guests is 0 or less or greater than 8, then we can't reservae a table
    if (count < 1 || count > 8) {
      System.out.println("Invalid reservation!");
    }

    partyName = name;
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }

  //a method to confirm or deny a reservation
  public void confirmReservation() {
    //confirm reservation if the restaurant has more or same seating capacity as the guests coming AND if the restaurant is open
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed!");
      //reservation is confirmed and boolean is set to true
      isConfirmed = true;
    }
    //for all other cases, deny the reservation
    else {
      System.out.println("Reservation denied.");
      //reservation is denied and boolean is set to false
			isConfirmed = false;
    }
  }

  //based on the boolean isConfirmed, we show the message to the user
  public void informUser() {

    //if the boolean is false
    if (!isConfirmed) {
      System.out.println("Couldn't make reservation, please contact restaurant.");
    }
    //if the boolean is true
    else {
      System.out.println("Enjoy your meal!");
    }
  }

  //main method
  public static void main(String[] args) {

    //new instance of the Reservation class
    Reservation Natalia = new Reservation("Natalia", 3, 4, true);
    //calling functions on the instance
    Natalia.confirmReservation();
    Natalia.informUser();

   //new instance of the Reservation class
    Reservation Samantha = new Reservation("Samantha", 10, 5, false);
    //calling functions on the instance
    Samantha.confirmReservation();
    Samantha.informUser();

   //new instance of the Reservation class
    Reservation Kyle = new Reservation("Kyle", 4, 5, true);
    //calling functions on the instance
    Kyle.confirmReservation();
    Kyle.informUser();
  }
}
