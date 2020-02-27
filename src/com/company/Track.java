package com.company;

public class Track implements Obstacle {

    private  final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean passObstacle(Participant participant) {
        if (participant.run() > length)
        {
            System.out.println("participant" + participant + "winner");
            return true;
        }
        else {
            System.out.println("participant" + participant + "loser");
            return false;
        }

    }
}
