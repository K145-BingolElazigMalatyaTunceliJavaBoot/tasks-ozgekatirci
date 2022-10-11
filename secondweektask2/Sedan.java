package firstweektask1.secondweektask2;

public class Sedan extends Car implements RentACarService {
    @Override
    public boolean isDailyRent() {
        return true;
    }

    @Override
    public boolean isMonthlyRent() {
        return true;
    }

    @Override
    public int getMonthlyRentPrice() {
        return 300*30;
    }

    @Override
    public int getDailyRentPrice() {
        return 300;
    }

    @Override
    public void dailyRent(Customer c, int period) {
        if(isDailyRent()){
            if(c.isCooparation()==true ){
                System.out.println("Sedan rent for "+c.getName()+". Price:"+(getDailyRentPrice()*period));
            }
            else{
                System.out.println("Only cooperations  can rent sedan daily.");
            }
        }
        else{
            System.out.println("Sedan can't rent daily.");
        }
    }

    @Override
    public void monthlyRent(Customer c, int period) {
        if(isMonthlyRent()){
            if(c.isCooparation()==true ){
                System.out.println("Sedan rent for "+c.getName()+". Price:"+(getMonthlyRentPrice()*period));
            }
            else{
                System.out.println("Only cooperations can rent sedan monthly.");
            }
        }
        else{
            System.out.println("Sedan can't rent monthly.");
        }

    }

    }

