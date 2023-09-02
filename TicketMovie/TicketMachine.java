package TicketMovie;

import java.util.*;
public class TicketMachine {
    private double ticketPrice;
    private int numberOfTickets;
    private int numberOfCoins;
    private int customerCoins;

    public TicketMachine(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
    public TicketMachine(double ticketPrice){
        this.ticketPrice = ticketPrice;
    }
    public TicketMachine(double ticketPrice, int numberOfTickets){
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public int getNumberOfCoins() {
        return numberOfCoins;
    }

    public int getCustomerCoins() {
        return customerCoins;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "TicketMachine{" +
                "ticketPrice=" + ticketPrice +
                ", numberOfTickets=" + numberOfTickets +
                ", numberOfCoins=" + numberOfCoins +
                ", customerCoins=" + customerCoins +
                '}';
    }
    public void receiveTicketsFromAdmin(int tickets){
        numberOfTickets += tickets;
    }
    public int giveAllCoinsToAdmin(){
        int total = numberOfCoins;
        numberOfCoins = 0;
        return total;
    }
    public void receiveCoinsFromCustomer(int coins){
        customerCoins+= coins;
    }
    public int sellTicketsToCustomer(int tickets) {
        double totalPrice = tickets * ticketPrice;
        Math.ceil(totalPrice);

        if (tickets > numberOfTickets) {
            return -1;
        } else if ((tickets < numberOfTickets) && (customerCoins < totalPrice)) {
            return -2;
        } else if ((tickets < numberOfTickets) && (customerCoins > totalPrice)) {
            double change = customerCoins - tickets;
            numberOfTickets -= tickets;
            numberOfCoins += totalPrice;
            customerCoins = 0;
            return (int) change;
        }
        return 0;
    }
    public int returnCoinsToCustomer(){
        int total = customerCoins;
        customerCoins = 0;
        return total;
    }
}
