package control;

import Pojo.Train;
import service.TicketService;
import service.TrainService;

import java.util.List;
import java.util.Scanner;

public class TravelTicketSystem {
    public static void main(String[] args) {
        TicketService ticketService = new TicketService();
        TrainService trainService = new TrainService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Search Train by Destination");
            System.out.println("4. Buy Ticket");
            System.out.println("5. View Tickets");
            System.out.println("6. Logout");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String registerUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String registerPassword = scanner.nextLine();
                    ticketService.register(registerUsername, registerPassword);
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = scanner.nextLine();
                    ticketService.login(loginUsername, loginPassword);
                    break;
                case 3:
                    System.out.print("Enter destination: ");
                    String destination = scanner.nextLine();
                    List<Train> trains = trainService.searchTrains(destination);
                    trainService.displayTrains(trains);
                    break;
                case 4:
                    System.out.print("Enter ticket details: ");
                    String ticket = scanner.nextLine();
                    ticketService.buyTicket(ticket);
                    break;
                case 5:
                    ticketService.viewTickets();
                    break;
                case 6:
                    ticketService.logout();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}