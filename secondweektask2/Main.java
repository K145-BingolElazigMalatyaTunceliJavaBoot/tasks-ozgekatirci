package firstweektask1.secondweektask2;

public class Main {
    public static void main(String[] args) {
        Customer a=new Customer();
        a.setName("Özge");
        a.setCooparation(true);
        Sedan s=new Sedan();
        Hatchback h=new Hatchback();
        SUV u =new SUV();
        u.setAge(5);

        s.monthlyRent(a,2);
        s.dailyRent(a,3);
        h.monthlyRent(a,2);
        h.dailyRent(a,1);
        u.monthlyRent(a,4);
        u.dailyRent(a,3);

    }
}
