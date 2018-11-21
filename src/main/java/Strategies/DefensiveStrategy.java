package Strategies;

import Behaviours.IStrategy;

public class DefensiveStrategy implements IStrategy {
    public String makeMove() {
        return "I'm making a defensive strategy";
    }
}
