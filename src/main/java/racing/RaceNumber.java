package racing;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RaceNumber {
    private int raceNumber;
    private int raceScore;

    public RaceNumber(int raceNumber, int raceScore) {
        this.raceNumber = raceNumber;

    }

    //랜덤의 1부터 6까지의 숫자 중 하나 뽑기
    public int randomNumber(){

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Collections.shuffle(numbers);

        raceNumber = numbers.get(0);
        return raceNumber;
    }


    //raceNumber 따라 얻는 점수 계산하기
    public int raceScore(){

        int getScore = -1;
        if(raceNumber <= 2){
            getScore = 0;}
        else{getScore = raceScore;}


        return raceScore;
    }




















}
