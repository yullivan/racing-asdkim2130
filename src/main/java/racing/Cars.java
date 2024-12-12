package racing;

import java.util.List;

public class Cars {
    Car carList;

    public Cars(Car carList) {
        this.carList = carList;
    }

    public Car getCarList() {
        return carList;
    }

    Car cars  = new Car("입력", 0);

    public List<Car> carList() {
        List<Car> carList = List.of(
                new Car(cars.carName(), cars.raceNumber()),
                new Car(cars.carName(), cars.raceNumber()),
                new Car(cars.carName(), cars.raceNumber()));

        return carList;
    }


}
