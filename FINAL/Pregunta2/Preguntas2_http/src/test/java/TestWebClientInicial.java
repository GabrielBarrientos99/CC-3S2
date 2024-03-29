import org.example.WebClient;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWebClientInicial {

    @BeforeAll
    public static void setUp() {

    }

    @AfterAll
    public static void tearDown() {
        // Se detiene Jetty.
    }

    @Test
    @Disabled(value = "Esto es un ejemplo de prueba inicial . Por tanto si se ejecuta no funciona.")
    public void testGetContentOk() throws MalformedURLException {
        WebClient client = new WebClient();
        String workingContent = client.getContent(new URL("http://localhost:8081/testGetContentOk"));

        assertEquals("Esto trabaja", workingContent);
    }
}
