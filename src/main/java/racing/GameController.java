package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

    public List<String> carNames (){
        List<String> carName = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(i + "번 째 자동차의 이름을 10 글자 이내로 써 주세요.");

            if(scanner.next().length() > 10){
                throw new IllegalArgumentException("Error! 자동차 이름을 10 글자 이내로 써 주세요.");

            }carName.add(scanner.next());
        }return carName;

    }





}
