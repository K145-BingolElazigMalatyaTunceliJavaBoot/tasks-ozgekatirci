package firstweektask1.thirdweek.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Apple");
        AppleStore ap=new AppleStore();
        System.out.println(ap.getFruitQuantity());
        ap.addFruit(5);
        System.out.println(ap.getFruitQuantity());
        ap.buyFruit(3);
        System.out.println(ap.getFruitQuantity());
        ap.buyFruit(10);
        System.out.println(ap.getFruitQuantity());

        System.out.println("Cherry");

        CherryStore cs=new CherryStore();
        System.out.println(cs.getFruitQuantity());
        cs.addFruit(5);
        System.out.println(cs.getFruitQuantity());
        cs.buyFruit(3);
        System.out.println(cs.getFruitQuantity());
        cs.buyFruit(10);
        System.out.println(cs.getFruitQuantity());

        System.out.println("Pear");

        PearStore ps=new PearStore();
        System.out.println(ps.getFruitQuantity());
        ps.addFruit(5);
        System.out.println(ps.getFruitQuantity());
        ps.buyFruit(3);
        System.out.println(ps.getFruitQuantity());
        ps.buyFruit(10);
        System.out.println(ps.getFruitQuantity());


    }

}
