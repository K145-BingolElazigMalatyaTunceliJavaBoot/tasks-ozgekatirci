package firstweektask1.thirdweek.tasks.task2;

public class Seat {
    private String seatNo;
    private boolean isReserved;

    private String seatType;

    public Seat(String seatNo, String seatType, boolean isReserved){
        this.seatType=seatType;
        this.isReserved=isReserved;
        this.seatNo=seatNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }



    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }



}
