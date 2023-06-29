import java.util.Scanner;

public class Main {

    private static Scanner sc;

    private static void encode() {
        System.out.println("---ENIGMA-ENCODER---");
        boolean prev = false;
        while(true) {
            System.out.println("1. Generate Random Key\n2. Custom Key\n3. Map Values\n4. Generate With Previous Key\n5. Back");
            int choice = sc.nextInt();
            if(choice == 5) return;
            EnigmaEncoder encoder = new EnigmaEncoder();

        }
    }

    private static void decode() {

    }

    private static void exit() throws InterruptedException {
        System.out.println("Removing Downloaded Files...");
        Thread.sleep(2000);
        System.out.println("Removing Cache Files...");
        Thread.sleep(1500);
        System.out.println("Removing User Data...");
        Thread.sleep(1200);
        System.out.println("Exiting....");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("----ENIGMA----");
        sc = new Scanner(System.in);
        while(true) {
            System.out.print("1. Encode\n2. Decode\n3. Exit\nEnter ur choice: ");
            int choice = sc.nextInt();
            if(choice == 1) encode();
            else if(choice == 2) decode();
            else if(choice == 3) {
                exit();
                break;
            } else System.out.println("Try Again... Invalid Input");
        }
    }
}