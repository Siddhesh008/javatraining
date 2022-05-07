/*
Create a class that captures airline tickets. Each ticket lists the departure and arrival cities, a 
flight number, and a seat assignment. A seat assignment has both a row and a letter for the seat 
within the row (such as 12F). Make two examples of tickets.

*/

import java.util.*;

class airlineTicket
{

String departure,city,flightno,seatassignment;

airlineTicket(String Dep ,String City , String Flightno ,String seatassign){


departure = Dep ;
city = City ;
flightno = Flightno;
seatassignment = seatassign ;

}

 void show(){
 
System.out.println("Departure : "+""+departure);
System.out.println("arrival cities : "+""+city);
System.out.println("flight no : "+""+flightno);
System.out.println("SeatAssignment :"+""+seatassignment); 
 
 
 }





}


public class Exercise4 {
public static void main(String args[])
{


airlineTicket ob1 = new airlineTicket("Aurangabad ","Mumbai","Airline20221960","F12");

ob1.show();


}
}