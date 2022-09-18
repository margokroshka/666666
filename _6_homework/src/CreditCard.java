import java.util.Arrays;
import java.util.Scanner;

public class CreditCard {
    int number;
    int summ;

    CreditCard() {
    }

    CreditCard(int number, int summ) {
        this.number = number ;
        this.summ = summ;
    }
    void receiveSumm(int number, int summ) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(summ);
        summ=a+summ;
        System.out.println(summ);

    }
    void receiveMin(int number, int summ) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(summ);
        summ=a-summ;
        System.out.println(summ);

    }
    int getNumber() {
        return number;
    }
    int getSumm() {
        return summ;
    }
}
