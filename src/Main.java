import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random(); // For customer id
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type Your Name: ");
        String name = scanner.next();
        Bank bank = new Bank(random.nextInt(10),name,random.nextInt(501) + 500);


    }
}