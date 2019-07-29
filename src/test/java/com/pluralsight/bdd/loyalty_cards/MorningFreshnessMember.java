package com.pluralsight.bdd.loyalty_cards;

import org.assertj.core.internal.bytebuddy.implementation.bind.annotation.Super;

public class MorningFreshnessMember {
    private String name;
    private SuperSmoothieSchema schema;
    private int points;

    public MorningFreshnessMember(String name, SuperSmoothieSchema schema) {
        this.name = name;
        this.schema = schema;
    }

    public void orders(Integer amount, String drink) {
        points += schema.getPointsFor(drink) * amount;
    }

    public int getPoints() {
        return points;
    }
}
