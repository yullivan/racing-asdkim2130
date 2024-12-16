package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {
    private static int gameTires;

    public GameController() {
        this.gameTires = 0;
    }

    public int getGameTires() {
        return gameTires;
    }

    //게임횟수 입력받기
    public int gameTries() {

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("게임 횟수를 입력하세요. 게임은 10번까지 실행할 수 있습니다.");
            gameTires = scanner.nextInt();

            if(gameTires< 0 || gameTires > 10){
                System.out.println("1부터 10까지의 숫자를 입력해 주세요");
            }else break;
        }return gameTires;
    }


    // 게임을 돌리는 반복문, toString을 받아 출력
    List<Car> carList = new ArrayList<>();

    public void gamming (){
        for (int i = 0; i < gameTires; i++) {
            for (Car car : carList) {
                car.raceNumber();
            }System.out.println(toString());
        }
    }



    //제일 멀리 간 차 구하고 우승자 return
    List<String> winCar = new ArrayList<>();
    int theMostMove = 0;

    public List<String> getWinCar (){
        for (Car car : carList) {
            if(car.getRaceNumber() > theMostMove){
                theMostMove = car.getRaceNumber();
                winCar.clear();
                winCar.add(car.getCarName());
            }else if(car.getRaceNumber() == theMostMove){
                winCar.add(car.getCarName());
            }
        }
        return winCar;
    }
}



