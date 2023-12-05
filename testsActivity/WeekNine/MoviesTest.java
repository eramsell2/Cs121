package WeekNine;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class MoviesTest {
    private movies Inception;
    private movies Interstellar;
    @BeforeEach
    public void setUp(){
        Inception = new movies("sci-fi", "Inception", 148);
        Interstellar = new movies("sci-fi", "Interstellar", 169);
    }
    @Test
    public void testInstanceCount(){
        assertEquals(2,movies.getInstanceCount());

    }

}