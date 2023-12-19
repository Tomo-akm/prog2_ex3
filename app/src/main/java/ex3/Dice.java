package ex3;

import java.util.Random;

public class Dice {
    private int value;

    Dice() {
        this.value = play();
    }

    int play() {
        Random random = new Random();
        int num = random.nextInt(6) + 1;
        return num;
    }

    int getValue() {
        return this.value;
    }
}
