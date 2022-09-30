package firstweektask1.secondweektask2;

public class Hatchback extends Car implements RentACar {

    @Override
    public boolean isMonthlyRent() {
        return false;
    }

    @Override
    public boolean isDailyRent() {
        return true;
    }

    @Override
    public int getDailyRentPrice() {
        return 200;
    }

    @Override
    public void dailyRent(Customer c, int period) {
        if (isDailyRent()) {
            System.out.println("Hatchback rent for " + c.getName() + ". Price:" + (getDailyRentPrice() * period));
        } else {
            System.out.println("Hatchback can't rent daily.");
        }
    }

    @Override
    public void monthlyRent(Customer c, int period) {
        System.out.println("Hatchback can't rent monthly.");
    }
}
