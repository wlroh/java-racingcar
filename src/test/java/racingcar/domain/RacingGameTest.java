package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class RacingGameTest {

    @Test
    @DisplayName("InputCarCount 값이 널일 경우 IllegalArgumentException.class 예외를 반환한다.")
    void carCountNullCheck() throws Exception {
        assertThatThrownBy(() -> new RacingGame(null, new InputRoundCount("2")))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("InputRoundCount 값이 널일 경우 IllegalArgumentException.class 예외를 반환한다.")
    void roundCountNullCheck() throws Exception {
        assertThatThrownBy(() -> new RacingGame(new InputCarCount("3"), null))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("자동차 대수를 3개 입력하면 3개의 자동차가 생성된다.")
    void carGenerate() throws Exception {
        RacingGame racingGame = new RacingGame(new InputCarCount("3"), new InputRoundCount("2"));

        List<Car> cars = racingGame.getCars();

        assertThat(cars.size()).isEqualTo(3);
    }

}