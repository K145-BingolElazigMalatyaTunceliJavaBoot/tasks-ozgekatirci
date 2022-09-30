package firstweektask1.firstweektask1;

import java.util.*;
import java.lang.*;

public class homework {


    /**
     * Okul puanlarının harf karşılığını yazan program.
     * Random alınabilir değerler.
     * 0 - 35 arası FF
     * 35 - 50 arası DC
     * 50 - 70 arası BB
     * 70 - 100 arası AA
     */
    static void LetterGrade(double grade) {
        if (grade >= 0 && grade < 35) System.out.println("FF");
        else if (grade >= 35 && grade < 50) System.out.println("DC");
        else if (grade >= 50 && grade < 70) System.out.println("BB");
        else if (grade >= 70 && grade <= 100) System.out.println("AA");
    }

    /**
     * 3 ile 100 arasında asal sayıların toplamını bulan program.
     */
    static void SumOfPrimeNumbers() {
        int sum = 0;
        boolean flag = true;
        for (int i = 3; i <= 100; i++){
            flag=true;
            for (int j = 2; j < i; j += 1) {
                if (i % j == 0){
                    flag=false;
                    break;
                }

            }
            if(flag==true)
              sum += i;
        }
        System.out.println("sum of prime numbers: "+ sum);
    }

    /**
     * 200 ile 500 arasındaki 3 ile tam bölünen sayılar dışındaki sayıların toplamını bulan program.
     *
     */

    static void NotDivisibleBy3() {
        int sum = 0;
        boolean flag = true;
        for (int i = 200; i <= 500; i++){
            if (i % 3 != 0){
                sum += i;
            }
        }
        System.out.println("sum of numbers not divisible by 3: "+ sum);
    }

    /**
     * 0 ile 500 aralığında ve
     * Bu sayılardan 50 ile 100 arasında bir sayı bulunana kadar rastgele sayılar seçilir.
     * 50 ile 100 arasındaki sayının kaçıncı seçimde bulunduğunu bulan program.
     */
    static void FindCorrectRandomNumber() {
        int count=0;
        while(true) {
            Random Rand = new Random();
            int randomNum = Rand.nextInt((500 - 0) + 1) + 0;
            count++;
            if(randomNum>=50 && randomNum<=100)
            {
                System.out.println("Random number is "+ randomNum + " and found at "+ count +"th try.");
                break;
            }
        }
    }

    public static void main(String[] args) {

        Random Rand = new Random();
        int randomGrade = Rand.nextInt((100 - 0) + 1) + 0;
        System.out.println("Your Letter Grade: " + randomGrade);

        LetterGrade(randomGrade);
        SumOfPrimeNumbers();
        NotDivisibleBy3();
        FindCorrectRandomNumber();

    }
}

