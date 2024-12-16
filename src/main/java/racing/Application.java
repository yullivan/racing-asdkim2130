package racing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

//        추상화 실패 ㅠㅠ
//        Car cars = new Car("입력", 0);
//        int gameTries = cars.gameTries();
//        cars.carName();


        //자동차 이름 입력
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("자동차의 이름을 입력하세요");
            Scanner scanner = new Scanner(System.in);

            String carName;
            while (true) {

                carName = scanner.next();

                if (carName.length() > 10) {
                    System.out.println("자동차 이름은 10글자 이내여야 합니다.");

                } else {
                    break;
                }
            }carList.add(new Car(carName));
        }





        // 게임횟수 입력
        int gameTries = 0;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("게임 횟수를 입력하세요. 게임은 10번까지 실행할 수 있습니다.");
            gameTries = scanner.nextInt();

            if(gameTries < 0 || gameTries > 10){
                System.out.println("1부터 10까지의 숫자를 입력해 주세요");
            }else break;
        }



        // 자동차 움직이기
        Random random = new Random();
        for (int i = 0; i < gameTries; i++) {
            System.out.println("(" + (i + 1) + ")");
            for (Car car : carList) {
                int diceNumber = random.nextInt(6) + 1;
                if(diceNumber >= 3) {
                    car.raceNumber();
                }System.out.println("🚗" + car.getCarName() + " : " + "_".repeat(car.getRaceNumber()));
            }
        }


        //우승자 출력
        List<String> winCar = new ArrayList<>();
        int theMostMove = 0;

        for (Car car : carList) {
            if(car.getRaceNumber() > theMostMove){
                theMostMove = car.getRaceNumber();
                winCar.clear();
                winCar.add(car.getCarName());
            }else if(car.getRaceNumber() == theMostMove){
                winCar.add(car.getCarName());
            }
        }
        System.out.println("우승자는 " + String.join(", ", winCar));


    }
}




