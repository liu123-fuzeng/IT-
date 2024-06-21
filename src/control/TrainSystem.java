package control;

import Pojo.Train;
import service.TrainService;

import java.util.List;
import java.util.Scanner;




public class TrainSystem {
    public static void main(String[] args) {
        TrainService trainService = new TrainService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Search Train by Destination");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter destination: ");
                    String destination = scanner.nextLine();
                    List<Train> trains = trainService.searchTrains(destination);
                    trainService.displayTrains(trains);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}