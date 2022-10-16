package firstweektask1.thirdweek.tasks.task2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Company {
    List<Seat> allSeats=new ArrayList<>();
    List<Passenger>passengers=new ArrayList<>();
    private int ticketPrice;
    private String flightType;

    public void addSeatList(){
        Seat[] seatList=new Seat[]{
                new Seat("A1", "economy",true),
                new Seat("A2","economy",true),
                new Seat("A3","economy",false),
                new Seat("B1","business",false),
                new Seat("B2","business",true),
                new Seat("B3","business",false),
        };
        allSeats.addAll(Arrays.asList(seatList));

    }

    public List<Seat>getAllSeats(){
        return this.allSeats;
    }

    public void addPassenger( Passenger passenger){
        passengers.add(passenger);
    }

    public void addSeat( Seat seat){
        allSeats.add(seat);
    }
    public List<Seat>  getAllEmptySeats(){
        List<Seat> emptySeatList = new ArrayList<>();
        for(Seat element: allSeats){
            if(element.isReserved()==false){
                emptySeatList.add(element);
            }
        }

        return emptySeatList;
    }
    public void buyTicket(Seat s,Passenger p){
        if(s.isReserved()==true){
            System.out.println("Seat reserved,you can't buy.");
        }
        else{
            if(s.getSeatType()=="business"){
                ticketPrice=5000;
            }
            else{
                ticketPrice=2500;
            }
            System.out.println(p.getPassengerName()+",your seat is reserved.");
            System.out.println("Your invoice : "+getTicketPrice());
            s.setReserved(true);
        }
    }
    public void abroadFoodManager(){
        System.out.println("Enjoy your meal.");
    }
    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }



}
