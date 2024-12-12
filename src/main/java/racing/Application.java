package racing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {


        Car cars = new Car("입력", 0);
        int gameTries = cars.gameTries();
        cars.carName();

        for (int i = 0; i < gameTries; i++) {

             List<Car> carList = List.of(
                new Car(cars.getName(), cars.raceNumber()),
                new Car(cars.getName(), cars.raceNumber()),
                new Car(cars.getName(), cars.raceNumber()));

        System.out.println(carList);
    }


    }



}




