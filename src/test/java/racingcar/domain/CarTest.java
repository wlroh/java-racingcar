package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
    
    @Test
    @DisplayName("condition 값이 4 보다 작으면 Car 의 위치값은 유지된다.")
    void carStop() throws Exception {
        Car car = new Car();
        int oldPosition = car.getPosition();

        car.stopOrGo(3);

        assertThat(car.getPosition()).isEqualTo(oldPosition);
    }

    @Test
    @DisplayName("condition 값이 4 보다 작으면 Car 의 위치값 1 증가한다.")
    void carGo() throws Exception {
        Car car = new Car();
        int oldPosition = car.getPosition();

        car.stopOrGo(5);

        assertThat(car.getPosition()).isEqualTo(oldPosition + 1);
    }
}
