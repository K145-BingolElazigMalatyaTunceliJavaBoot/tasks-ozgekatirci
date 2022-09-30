package firstweektask1.secondweektask2;

public abstract class Car {

    private String color;
    private int packageCapacity;
    private boolean isMonthlyRent;
    private boolean isDailyRent;
    private int monthlyRentPrice;

    private int dailyRentPrice;

    public int getMonthlyRentPrice() {
        return monthlyRentPrice;
    }



    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public int getDailyRentPrice() {
        return dailyRentPrice;
    }

    public boolean isDailyRent() {
        return isDailyRent;
    }

    public boolean isMonthlyRent() {
        return isMonthlyRent;
    }


    public int getPackageCapacity() {
        return packageCapacity;
    }

    public int packageCapacity() {
        return packageCapacity;
    }

    public void setPackageCapacity(int packageCapacity) {
        this.packageCapacity = packageCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
