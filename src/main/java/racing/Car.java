package racing;

import java.util.*;

public class Car {

    private String carName;
    private int raceNumber;

    private List<String> carList;

    public Car(String carName) {
        this.carName = carName;
        this.raceNumber = 0;
    }

    public Car(List<String> carList, List<Integer> raceNumberList) {
        this.carList = carList;
    }

    public String getCarName() {
        return carName;
    }

    public int getRaceNumber() {
        return raceNumber;
    }

    public Car(List<String> carList) {
        this.carList = carList;
    }


    // 랜덤숫자 3이상이면 전진
    public void raceNumber () {
        Random random = new Random();

        int diceNumber = random.nextInt(6) + 1;
        if (diceNumber >= 3) {
            raceNumber++;
        }
    }



    // 자동차 이름 입력 받아 List<Car>만들기
    public List<Car> inputName() {

        List<Car>carList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            System.out.println("자동차의 이름을 입력하세요");
            Scanner scanner = new Scanner(System.in);

            while (true) {
                carName = scanner.next();

                if (carName.length() > 10) {
                    System.out.println("자동차 이름은 10글자 이내여야 합니다.");
                } else break;

                carList.add(new Car(carName));
            }
        }return carList;
    }


//          GameController로 이동
//        public int gameTries() {
//            int gameTires = -1;
//            while(true){
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("게임 횟수를 입력하세요. 게임은 10번까지 실행할 수 있습니다.");
//                gameTires = scanner.nextInt();
//
//                if(gameTires< 0 || gameTires > 10){
//                    System.out.println("1부터 10까지의 숫자를 입력해 주세요");
//                }else break;
//            }return gameTires;
//     }



    @Override
    public String toString() {
        return "🚗" +
                carName + "_".repeat(raceNumber);
    }
}
