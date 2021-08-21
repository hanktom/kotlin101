package com.tom;

public class PokerCard {
    private int point;
    private int face;

    public PokerCard(int point, int face) {
        this.point = point;
        this.face = face;
    }

    public int getPoint() {
        return point;
    }

    public int getFace() {
        return face;
    }
}
