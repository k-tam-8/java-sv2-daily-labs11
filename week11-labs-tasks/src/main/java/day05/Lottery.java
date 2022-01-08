package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    private int numberCount=10;
    private int pullCount=5;

    public List<Integer> startLottery(){
        List<Integer> pulledNumbers = new ArrayList<>();
        Random rnd = new Random();
        pulledNumbers.add(rnd.nextInt(numberCount)+1);
        for (int i = 0; i < pullCount; i++) {
            int rndNum = rnd.nextInt(numberCount)+1;
            while (pulledNumbers.contains(rndNum)){
                rndNum = rnd.nextInt(numberCount)+1;
            }
            pulledNumbers.add(rndNum);
        }
        System.out.println(pulledNumbers.toString());
        return pulledNumbers;
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        lottery.startLottery();
    }
}
