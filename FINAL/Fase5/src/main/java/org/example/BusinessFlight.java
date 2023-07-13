package org.example;

public class BusinessFlight extends Flight{
    public BusinessFlight(String id) {
        super(id);
    }
    @Override
    public boolean addPassenger(Passenger passenger) {
        if (passenger.isVip() && !getPassengersList().contains(passenger)) {
            return getPassengersList().add(passenger);
        }
        return false;
    }
    @Override
    public boolean removePassenger(Passenger passenger) {
        return false;
    }
}
