package racing;

import java.util.Collections;
import java.util.List;
import java.util.Random;
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
            Random random = new Random();
            int raceNumber = -1;

            int diceNumber = random.nextInt(6) + 1;

            if (diceNumber < 3) {
                raceNumber = 0;
            }else
                raceNumber = 1;


            return raceNumber;
        }


        public String carName () {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 3; i++) {


                while (true) {

                    System.out.println("자동차의 이름을 입력해 주세요.");
                    name = scanner.next();

                    if (name.length() > 10) {
                        System.out.println("Error! 자동차의 이름은 10 글자 이내로 입력해 주세요.");
                    } else break;

                }
            }
            return name;
        }

        public int printLn () {

            for (int i = 0; i < gameTries(); i++) {


//                System.out.println("🚗" + getName() + "_".repeat(raceNumber));
                raceNumber++;
            }
            return raceNumber;
        }

        public int gameTries() {
            int gameTires = -1;
            while(true){
                Scanner scanner = new Scanner(System.in);
                System.out.println("게임 횟수를 입력하세요. 게임은 10번까지 실행할 수 있습니다.");
                gameTires = scanner.nextInt();

                if(gameTires< 0 || gameTires > 10){
                    System.out.println("1부터 10까지의 숫자를 입력해 주세요");
                }else break;
            }return gameTires;

        }

    @Override
    public String toString() {
        return "🚗" + name + "_".repeat(raceNumber);
    }
}
