package airlinereservation;

import airlinereservation.entity.Passenger;
import java.util.Scanner;
import java.util.PriorityQueue;

/**
 *
 * @author Duc
 */
public class Reservation {
    static Passenger passenger = new Passenger();
    static PriorityQueue<Passenger> queue = new PriorityQueue<Passenger>();
    
    public void addPassenger() {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter guest list .");
        
        System.out.println("Enter id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter address : ");
        String address = sc.nextLine();
        System.out.println("Enter phone: ");
        String phone = sc.nextLine();
        System.out.println("Enter of depature: ");
        String departuer = sc.nextLine();
        System.out.println("Enter of return: ");
        String comeback = sc.nextLine();
        
        
        passenger.setReservationID(id);
        passenger.setPassengerName(name);
        passenger.setAddress(address);
        passenger.setPhone(phone);
        passenger.setDepartuer(departuer);
        passenger.setComeback(comeback);
        queue.add(passenger);
        
    }

    public void modifyPassenger() {
        
        for (Passenger pa : queue) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id: ");
            int id = sc.nextInt();
            sc.nextLine();
            if (id==pa.getReservationID()) {
                
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                System.out.println("Enter address : ");
                String address = sc.nextLine();
                System.out.println("Enter phone: ");
                String phone = sc.nextLine();
                System.out.println("Enter of depature: ");
                String departuer = sc.nextLine();
                System.out.println("Enter of return: ");
                String comeback = sc.nextLine();

                passenger.setPassengerName(name);
                passenger.setAddress(address);
                passenger.setPhone(phone);
                passenger.setDepartuer(departuer);
                passenger.setComeback(comeback);
//                passenger.add(passenger);
            } else {
                System.err.println("Error id ");
            }
            
        }
        
    }

    public void displayPassenger() {
        int id=1;
        for (Passenger passenger1 : queue) {
           
            if (!queue.isEmpty()) {
                System.out.println("id " + passenger1.getReservationID()
                    + "\n - name: " + passenger1.getPassengerName()
                    + "\n - add: " + passenger1.getAddress()
                    + "\n - phone: " + passenger1.getPhone()
                    + "\n - departuer: " + passenger1.getDepartuer()
                    + "\n - combank: " + passenger1.getComeback()
            );
            } else {
                System.out.println("Display list error ");
            }
            }
        id++;
    }
     
    
}
