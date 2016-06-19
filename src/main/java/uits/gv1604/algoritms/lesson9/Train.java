package uits.gv1604.algoritms.lesson9;

import java.sql.Time;

public class Train {
    private String destination;
    private int trainNumber;
    private Time departureTime;
    private int generalSeats;
    private int economyClass;
    private int compartment;
    private int lux;

    public Train(String destination, int trainNumber, Time departureTime, int generalSeats,
                 int economyClass, int compartment, int lux) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.generalSeats = generalSeats;
        this.economyClass = economyClass;
        this.compartment = compartment;
        this.lux = lux;
    }

    public String getDestination() {
        return destination;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public int getGeneralSeats() {
        return generalSeats;
    }

    public int getEconomyClass() {
        return economyClass;
    }

    public int getCompartment() {
        return compartment;
    }

    public int getLux() {
        return lux;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;

        Train train = (Train) o;

        if (getTrainNumber() != train.getTrainNumber()) return false;
        if (getGeneralSeats() != train.getGeneralSeats()) return false;
        if (getEconomyClass() != train.getEconomyClass()) return false;
        if (getCompartment() != train.getCompartment()) return false;
        if (getLux() != train.getLux()) return false;
        if (!getDestination().equals(train.getDestination())) return false;
        return getDepartureTime().equals(train.getDepartureTime());

    }

    @Override
    public int hashCode() {
        int result = getDestination().hashCode();
        result = 31 * result + getTrainNumber();
        result = 31 * result + getDepartureTime().hashCode();
        result = 31 * result + getGeneralSeats();
        result = (31 * result) + getEconomyClass();
        result = 31 * result + getCompartment();
        result = 31 * result + getLux();
        return result;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination='" + destination + '\'' +
                ", trainNumber=" + trainNumber +
                ", departureTime=" + departureTime +
                ", generalSeats=" + generalSeats +
                ", economyClass=" + economyClass +
                ", compartment=" + compartment +
                ", lux=" + lux +
                '}';
    }
}
