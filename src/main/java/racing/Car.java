package racing;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Car {

        private String name;
        private int raceNumber;

    public Car(String name, int raceNumber){
            this.name = name;
            this.raceNumber = raceNumber;
        }

        public String getName () {
            return name;
        }

        public int getRaceNumber () {
            return raceNumber;
        }

        //랜덤 숫자 뽑기
        public int raceNumber () {

            int diceNumber = -1;
            List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
            Collections.shuffle(numbers);

            diceNumber = numbers.get(0);

            if (diceNumber < 3) {
                raceNumber = 0;
            }
            if (diceNumber >= 3) {
                raceNumber = 1;

            }
            return raceNumber;


        }

        public String carName () {
            while (name.length() > 10 || name.length() < 0) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("자동차의 이름을 10 글자 이내로 입력해 주세요.");
                name = scanner.next();

                if (name.length() > 10 || name.length() < 0) {
                    throw new IllegalArgumentException("자동차의 이름은 10 글자 이내로 입력해 주세요.");
                }

            }
            return name;
        }

        public int printLn () {
//            int gameTries = gameTries(); // 구현필요
            for (int i = 0; i < gameTries(); i++) {


                System.out.println("🚗" + getName() + "_".repeat(raceNumber));
                raceNumber++;
            }
            return raceNumber;

        }

        public int gameTries() {
            int gameTires = -1;
            while(gameTires < 0 || gameTires > 10){
                Scanner scanner = new Scanner(System.in);
                System.out.println("게임 횟수를 입력하세요. 게임은 10번까지 실행할 수 있습니다.");
                gameTires = scanner.nextInt();

                if(gameTires< 0 || gameTires > 10){
                    throw new IllegalArgumentException("1부터 10까지의 숫자를 입력해 주세요");
                }
            }return gameTires;

        }


}
