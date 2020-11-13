package study.racing4.view;

import study.racing4.Car;

import java.util.List;
import java.util.stream.IntStream;

public class ResultView {

    private static final char POSITION_MARK = '-';

    public void printCarPosition(List<Car> cars) {
        for (Car car : cars) {
            System.out.print(car.getName() + " : " + POSITION_MARK);
            IntStream.range(0, car.getPosition())
                    .forEach(t -> System.out.print(POSITION_MARK));
            System.out.println();
        }
        System.out.println();
    }

    public void printWinner(List<Car> cars) {

        int lastCar = cars.size();
        int count = 1;
        for(Car car: cars) {

            System.out.print(car.getName());
            if(count++ < lastCar) {
                System.out.print(", ");
            }
        }

        System.out.println("가 최종 우승했습니다.");
    }

}
