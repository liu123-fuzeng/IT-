package control;

import service.TicketService;

import java.util.Scanner;

public class TicketSystem {
    public static void main(String[] args) {
        TicketService ticketService = new TicketService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Buy Ticket");
            System.out.println("4. View Tickets");
            System.out.println("5. Logout");
            System.out.println("6. Exit");
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
                    System.out.print("Enter ticket details: ");
                    String ticket = scanner.nextLine();
                    ticketService.buyTicket(ticket);
                    break;
                case 4:
                    ticketService.viewTickets();
                    break;
                case 5:
                    ticketService.logout();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}