package org.example;

public class PremiumFlight extends Flight{
    public PremiumFlight(String id) {
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        if(passenger.isVip() && !getPassengersList().contains(passenger)){
            return getPassengersList().add(passenger);
        }
        return false;
    }
    @Override
    public boolean removePassenger(Passenger passenger) {
        return getPassengersList().remove(passenger);
    }
}
