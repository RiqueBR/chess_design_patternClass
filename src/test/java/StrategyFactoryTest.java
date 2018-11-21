import Behaviours.IStrategy;
import Strategies.AggressiveStrategy;
import Strategies.DefensiveStrategy;
import Strategies.StrategyFactory;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertNull;

public class StrategyFactoryTest {

    StrategyFactory factory;
//    IStrategy strategy;
//    AggressiveStrategy aggressiveStrategy;
//    DefensiveStrategy defensiveStrategy;

    @Before
    public void setUp() throws Exception {
        factory = new StrategyFactory();
    }

    @Test
    public void canGetStrategy() {
        String requested = "aggressive";
        IStrategy strategy = factory.getStrategy(requested);
        assert(strategy instanceof AggressiveStrategy);
    }

    @Test
    public void cannotGetUnexistentStrategy() {
        String requested = "mild";
        IStrategy strategy = factory.getStrategy(requested);
        assertNull(strategy);
    }
}
