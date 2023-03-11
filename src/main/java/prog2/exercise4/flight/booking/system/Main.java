package prog2.exercise4.flight.booking.system;


import java.time.LocalDate;

public class Main
{
    public static void main( String[] args )
    {
        String sdepart = "2023-03-12";
        LocalDate depart = LocalDate.parse(sdepart);

        String sreturn = "2023-03-13";
        LocalDate returnDate = LocalDate.parse(sreturn);

        FlightBooking fb = new FlightBooking("John Doe", depart, returnDate, 2, 3);
        int child = 2;
        int adults = 5;
        fb.setTripSource("1");
        fb.setTripDestination("1", "2");

        fb.setTripType("2");
        fb.setBookingClass("1");

        fb.setDepartingTicketPrice(child, adults);
        fb.setReturnTicketPrice();

        fb.setTotalTicketPrice();
        System.out.println(fb);
    }
}
