package Pojo;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<String> tickets;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.tickets = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public void buyTicket(String ticket) {
        tickets.add(ticket);
    }

    public List<String> getTickets() {
        return tickets;
    }
}
