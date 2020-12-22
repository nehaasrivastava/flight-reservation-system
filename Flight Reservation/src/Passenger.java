
public class Passenger {
        static String name;
     static long phone;
        String email;
      static  String type_of_ticket;
        String choice;
		public static String getName() {
			return name;
		}
		public static void setName(String name) {
			Passenger.name = name;
		}
		public static long getPhone() {
			return phone;
		}
		public static void setPhone(long phone) {
			Passenger.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public static String getType_of_ticket() {
			return type_of_ticket;
		}
		public static void setType_of_ticket(String type_of_ticket) {
			Passenger.type_of_ticket = type_of_ticket;
		}
		public String getChoice() {
			return choice;
		}
		public void setChoice(String choice) {
			this.choice = choice;
		}

}
