package firstweektask1.thirdweek.tasks.task2;

import java.util.List;

public class Passenger {
    private String passengerName;

    public Passenger(String passengerName,String flightType ) {
        this.passengerName = passengerName;
        this.flightType=flightType;
    }

    private String flightType;


    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }


    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }



}
