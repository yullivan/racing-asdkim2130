package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

    public List<String> carNames (){
        List<String> carName = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String name = "";

            while(name.length() > 10 || name.length() < 0){

                Scanner scanner = new Scanner(System.in);
                System.out.println((i + 1) + "번 자동차의 이름을 10 글자 이내로 써 주세요.");
                name = scanner.next();

                if(scanner.next().length() > 10 || scanner.next().length() < 0) {
                throw new IllegalArgumentException("자동차의 이름은 10 글자 이내로 써 주세요.");

            }
            }carName.add(name);
        }return carName;

    }

    public int gameTries(){
        int gameTries = -1;
        while(gameTries < 1 || gameTries > 10) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("실행할 게임 횟수를 입력하세요. 게임은 총 10회까지 할 수 있습니다.");
            gameTries = scanner.nextInt();

            if (gameTries < 1 || gameTries > 10) {
                throw new IllegalArgumentException("1부터 10까지의 숫자를 입력하세요");

            }
        }

        return gameTries;




    }



}
