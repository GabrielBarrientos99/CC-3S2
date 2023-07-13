import org.example.EconomyFlight;
import org.example.Flight;
import org.example.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EconomyTest {
    private Flight economyFlight;
    private Passenger checha;
    private Passenger lore;

    @BeforeEach
    void setUp() {
        economyFlight = new EconomyFlight("1");
        checha = new Passenger("Checha", false);
        lore = new Passenger("Lore", true);
    }
    @Test

    public void testEconomyFlightRegularPassenger() {
        assertAll("Verifica todas las condiciones para un pasajero regular y un vuelo economico",
                () -> assertEquals("1", economyFlight.getId()),
                () -> assertEquals(true, economyFlight.addPassenger(checha)),
                () -> assertEquals(1, economyFlight.getPassengersList().size()),
                () -> assertEquals("Checha", economyFlight.getPassengersList().get(0).getName()),
                () -> assertEquals(true, economyFlight.removePassenger(checha)),
                () -> assertEquals(0, economyFlight.getPassengersList().size())
        );
    }

    @Test
    public void testEconomyFlightVipPassenger() {
        assertAll("Verifica todas las condiciones para un pasajero VIP y un vuelo economico",
                () -> assertEquals("1", economyFlight.getId()),
                () -> assertEquals(true, economyFlight.addPassenger(lore)),
                () -> assertEquals(1, economyFlight.getPassengersList().size()),
                () -> assertEquals("Lore", economyFlight.getPassengersList().get(0).getName()),
                () -> assertEquals(false, economyFlight.removePassenger(lore)),
                () -> assertEquals(1, economyFlight.getPassengersList().size())
        );

    }

}
