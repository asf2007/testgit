package com.company;

public class Robot implements Participant {

    private final String name;
    private final int jumpHeight;
    private final int runLength;

    public Robot(String name, int jumpHeight, int runLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public int run() {

        System.out.println("robot" + name + "run" + runLength);
        return runLength;
    }

    @Override
    public int jump() {
        System.out.println("robot"+ name + "jump" + jumpHeight);
        return jumpHeight;
    }
}
