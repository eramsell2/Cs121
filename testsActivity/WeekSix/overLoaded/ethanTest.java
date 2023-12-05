package WeekSix.overLoaded;

import org.junit.Test;

import static org.junit.Assert.*;

public class ethanTest {

    @Test
    public void getAge() {
        assertEquals(17, ethan.getAge());
    }

    @org.junit.jupiter.api.Test
    void testGetAge() {
        assertEquals(19,ethan.getAge() );
    }

    @org.junit.jupiter.api.Test
    void testGetFeet() {
        assertEquals(2, ethan.getFeet());
    }
}