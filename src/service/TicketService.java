package service;

import Pojo.User;
import java.util.ArrayList;
import java.util.List;

public class TicketService {
    private List<User> users;
    private User loggedInUser;

    public TicketService() {
        users = new ArrayList<>();
        loggedInUser = null;
    }

    public void register(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println("User already exists!");
                return;
            }
        }
        users.add(new User(username, password));
        System.out.println("User registered successfully!");
    }

    public void login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.authenticate(password)) {
                loggedInUser = user;
                System.out.println("Login successful!");
                return;
            }
        }
        System.out.println("Invalid username or password!");
    }

    public void buyTicket(String ticket) {
        if (loggedInUser != null) {
            loggedInUser.buyTicket(ticket);
            System.out.println("Ticket purchased successfully!");
        } else {
            System.out.println("Please log in first!");
        }
    }

    public void viewTickets() {
        if (loggedInUser != null) {
            List<String> tickets = loggedInUser.getTickets();
            if (tickets.isEmpty()) {
                System.out.println("No tickets purchased.");
            } else {
                System.out.println("Purchased tickets:");
                for (String ticket : tickets) {
                    System.out.println(ticket);
                }
            }
        } else {
            System.out.println("Please log in first!");
        }
    }

    public void logout() {
        if (loggedInUser != null) {
            loggedInUser = null;
            System.out.println("Logged out successfully!");
        } else {
            System.out.println("No user is currently logged in.");
        }
    }
}
