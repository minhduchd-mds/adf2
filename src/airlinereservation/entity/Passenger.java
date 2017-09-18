/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservation.entity;

/**
 *
 * @author Duc
 */
public class Passenger implements Comparable<Passenger>{


  
    private int reservationID;
    private String passengerName;
    private String address;
    private String phone;
    private String departuer;
    private String comeback;

    public Passenger() {
    }

    
    public Passenger(int reservationID, String passengerName, String address, String phone, String departuer, String comeback) {
        this.reservationID = reservationID;
        this.passengerName = passengerName;
        this.address = address;
        this.phone = phone;
        this.departuer = departuer;
        this.comeback = comeback;  
    }
    
    
    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartuer() {
        return departuer;
    }

    public void setDepartuer(String departuer) {
        this.departuer = departuer;
    }

    public String getComeback() {
        return comeback;
    }

    public void setComeback(String comeback) {
        this.comeback = comeback;
    }

    /**
     *
     * @return
     */
    public  boolean equals(Passenger id){
          
        return this.getReservationID() == id.getReservationID();
}       
  
    public int compareTo(Passenger id) {
        if (this.equals(id)) {
            return 0;
        } else if (getReservationID() > id.getReservationID()) {
            return 1;
        } else {
            return -1;
        }
}  
}  
