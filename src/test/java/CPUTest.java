import Behaviours.IStrategy;
import Strategies.AggressiveStrategy;
import Strategies.DefensiveStrategy;
import org.junit.Before;
import org.junit.Test;
import players.CPU;

import static org.junit.Assert.assertEquals;

public class CPUTest {

    CPU cpu;
    IStrategy aggressive;

    @Before
    public void setUp() throws Exception {
        aggressive = new AggressiveStrategy();
        cpu = new CPU(aggressive);
    }

    @Test
    public void canGetStrategy() {
        assertEquals(aggressive, cpu.getStrategy());
    }

    @Test
    public void canMakeMove() {
        assertEquals("I'm making an aggressive strategy", cpu.makeMove());
    }

    @Test
    public void canChangeStrategy() {
        IStrategy defensive = new DefensiveStrategy();
        cpu.setStrategy(defensive);
        String result = cpu.makeMove();
        assertEquals("I'm making a defensive strategy", result);
    }
}
