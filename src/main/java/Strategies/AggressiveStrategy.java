package Strategies;

import Behaviours.IStrategy;

public class AggressiveStrategy implements IStrategy {
    public String makeMove() {
        return "I'm making an aggressive strategy";
    }
}
