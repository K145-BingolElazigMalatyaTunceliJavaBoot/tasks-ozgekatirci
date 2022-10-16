package firstweektask1.thirdweek.tasks.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Seat> allSeats=new ArrayList<>();
        List<Seat> emptySeats=new ArrayList<>();

        Passenger p=new Passenger("ozge","domestic");
        Seat s=new Seat("A9","business",false);
        Seat s2=new Seat("A8","economy",true);
        THY thy=new THY();
        thy.addSeatList();
        thy.addSeat(s);
        allSeats=thy.getAllEmptySeats();
        emptySeats=thy.getAllSeats();
        System.out.println("All Seats at THY");
        for (Seat element: allSeats){
            System.out.print(element.getSeatNo()+",");
        }
        System.out.println("");
        System.out.println("All Empty Seats at THY");
        for (Seat element: emptySeats){
            System.out.print(element.getSeatNo()+",");
        }
        System.out.println("");

        thy.buyTicket(s,p);
        thy.domesticDinnerService();


    }
}
