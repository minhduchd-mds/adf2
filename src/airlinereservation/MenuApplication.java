package airlinereservation;

import java.util.Scanner;

/**
 *
 * @author Duc
 */
public class MenuApplication {

    public void createMenu(){
        while (true) {
            System.out.println("==================List Room================");
            System.out.println("1.Add reservation.");
            System.out.println("2.Modify passenger records.");
            System.out.println("3.Display passenger records.");
            System.out.println("4.Exit.");
            System.out.println("===========================================");
            System.out.print("You choose: ");
            Scanner scanner = new Scanner(System.in);
            String strChoice = scanner.nextLine();
            System.out.println(strChoice);
            int choice = 0;
            try {
                choice = Integer.parseInt(strChoice);
                System.out.println("Choice: " + choice);
            } catch (java.lang.UnsupportedOperationException e) {
                System.err.println(e.getMessage());
                continue;
            }
            Reservation reservation = new Reservation();
            if (choice == 4) {
                break;
            } else {
                switch (choice) {
                    case 1:
                        reservation.addPassenger();
                        System.out.println("Add reservation.");
                        break;
                    case 2:
                        reservation.modifyPassenger();
                        System.out.println("Modif passenger records.");
                        break;
                    case 3:
                        reservation.displayPassenger();
                        System.out.println("Display passenger records.");
                        break;
                    default:
                        System.out.println("");
                }
            }
        }
    }

    public static void main(String[] args) {
        MenuApplication menu = new MenuApplication();
        menu.createMenu();

    }
    
}
