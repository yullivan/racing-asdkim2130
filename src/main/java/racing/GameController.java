package racing;

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



}
