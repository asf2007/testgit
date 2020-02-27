package com.company;

public class Cat implements Participant {
    private final String  name;
  private final  int  jumpHeight;
   private final int  runLength;

    public Cat(String name, int jumpHeight, int runLength) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }
    @Override
    public int run () {
        System.out.println("cat " + name + " run " + runLength );
        return runLength;
    }

    @Override
    public int jump() {
        System.out.println("cat" + name + "jump"+ jumpHeight);
        return jumpHeight;
    }

}
