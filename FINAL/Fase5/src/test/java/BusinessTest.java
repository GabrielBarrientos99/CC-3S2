import org.example.BusinessFlight;
import org.example.Flight;
import org.example.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusinessTest {
    private Flight businessFlight;
    private Passenger checha;
    private Passenger lore;

    @BeforeEach
    void setUp() {
        businessFlight = new BusinessFlight("2");
        checha = new Passenger("Checha", false);
        lore = new Passenger("Lore", true);
    }

    @Test
    public void testBusinessFlightRegularPassenger() {
        assertAll("Verifica todas las condiciones para un pasajero regular y un vuelo de negocios",
                () -> assertEquals(false, businessFlight.addPassenger(checha)),
                () -> assertEquals(0, businessFlight.getPassengersList().size()),
                () -> assertEquals(false, businessFlight.removePassenger(checha)),
                () -> assertEquals(0, businessFlight.getPassengersList().size())
        );
    }
    @Test
    public void testBusinessFlightVipPassenger() {
        assertAll("Verifica todas las condiciones para un pasajero VIP y un vuelo de negocios",
                () -> assertEquals(true, businessFlight.addPassenger(lore)),
                () -> assertEquals(1, businessFlight.getPassengersList().size()),
                () -> assertEquals(false, businessFlight.removePassenger(lore)),
                () -> assertEquals(1, businessFlight.getPassengersList().size())
        );
    }

}
