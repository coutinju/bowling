package test.java.fr.harvest.bowling;

import main.java.fr.harvest.bowling.Bowling;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingTest {

    private Bowling bowling;

    @BeforeEach
    public void initialize() {
        this.bowling = new Bowling();
    }

    @Test
    public void shouldReturn1() {
        assertEquals(1, this.bowling.return1());
    }
}