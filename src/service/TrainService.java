package service;

import Pojo.Train;

import java.util.ArrayList;
import java.util.List;

public class TrainService {
    private List<Train> trains;

    public TrainService() {
        trains = new ArrayList<>();
        // Sample data
        trains.add(new Train("T1001", "CityA", "10:00 AM", "02:00 PM"));
        trains.add(new Train("T1002", "CityB", "11:00 AM", "03:00 PM"));
        trains.add(new Train("T1003", "CityC", "12:00 PM", "04:00 PM"));
        trains.add(new Train("T1004", "CityD", "01:00 PM", "05:00 PM"));
    }

    public List<Train> searchTrains(String destination) {
        List<Train> result = new ArrayList<>();
        for (Train train : trains) {
            if (train.getDestination().equalsIgnoreCase(destination)) {
                result.add(train);
            }
        }
        return result;
    }

    public void displayTrains(List<Train> trains) {
        if (trains.isEmpty()) {
            System.out.println("No trains found for the given destination.");
        } else {
            System.out.println("Trains found:");
            for (Train train : trains) {
                System.out.println(train);
            }
        }
    }
}