package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Подготовительный этап...");
        Competition competition = createAndPrepareCompetition();

        System.out.println("Начинаем ");
        competition.startCompetition();

        System.out.println(" Победители:");
        for (Participant winner : competition.getLastWinners()) {
            System.out.println(winner);
        }
    }

    private static Competition createAndPrepareCompetition() {
        Participant person = new Man("Alex", 50, 500);
        Participant cat = new Cat("Masya", 200, 1500);
        Participant robot = new Robot("R2D2", 150, 5000);

        Random random = new Random();

        Wall wall = new Wall(random.nextInt(200));
        Track track = new Track(random.nextInt(1500));

        Competition competition = new Competition("Infinity War");
        competition.setParticipants(person, cat, robot);
        competition.setObstacles(wall, track);
        return competition;
    }

}
