package org.example;

public class EconomyFlight extends Flight{

    public EconomyFlight(String id) {
        super(id);
    }

    @Override
    public boolean addPassenger(Passenger passenger) {
        if (!getPassengersList().contains(passenger)) {
            return getPassengersList().add(passenger);
        }
        return false; // (CONTIENE) -> RECHAZA
    }

    @Override
    public boolean removePassenger(Passenger passenger) {
        if (!passenger.isVip()) {
            return getPassengersList().remove(passenger);
        }
        return false;
    }


}
