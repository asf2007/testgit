package com.company;

public class Wall implements Obstacle {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean passObstacle(Participant participant) {

        if (participant.jump() > height) {
            System.out.println("participant" + participant + "winner");
            return true;
        } else {
            System.out.println("participant" + participant + "loser");
            return false;
        }

    }
}