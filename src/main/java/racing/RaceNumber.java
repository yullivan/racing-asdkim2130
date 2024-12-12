package racing;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class RaceNumber {
    private int raceNumber;

    public RaceNumber(int raceNumber) {
        if(raceNumber < 0 || raceNumber > 6){
            throw new IllegalArgumentException("Error!");
        }


        this.raceNumber = raceNumber;
    }

    //랜덤의 1부터 6까지의 숫자 중 하나 뽑기
    public int randomNumber(){
        int randomnumber = -1;
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        Collections.shuffle(numbers);

        randomnumber = numbers.get(0);
        return randomnumber;
    }

















}
