package Pojo;

public class Train {
    private String trainNumber;
    private String destination;
    private String departureTime;
    private String arrivalTime;

    public Train(String trainNumber, String destination, String departureTime, String arrivalTime) {
        this.trainNumber = trainNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    @Override
    public String toString() {
        return "Train Number: " + trainNumber + ", Destination: " + destination + 
               ", Departure Time: " + departureTime + ", Arrival Time: " + arrivalTime;
    }
}
