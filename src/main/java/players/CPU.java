package players;

import Behaviours.IStrategy;

public class CPU extends Player {

    private IStrategy strategy;

    public CPU(IStrategy strategy) {
        this.strategy = strategy;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public String makeMove() {
        return this.strategy.makeMove();
    }
}
