package racingcar.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {
    private MovableStrategy movableStrategy;
    private String name;
    private String winner;
    private Cars cars;
    private Cycle cycle;
    private RacingGame racingGame;

    @BeforeEach
    public void set() {
        movableStrategy = new BiggerThanNumberStrategy();
        name = "a,b,c";
        cars = new Cars(name.split(","));
        cycle = new Cycle(3);
        winner = "b";
        racingGame = new RacingGame(cars, cycle);
    }

    @DisplayName("레이싱게임 객체를 만든다.")
    @Test
    public void racingGameTest() {
        assertThat(racingGame).isInstanceOf(RacingGame.class);
    }

    @DisplayName("레이싱게임이 끝났는지 알 수 있다.")
    @Test
    public void isNotPlayingTest() {
        racingGame.race();
        racingGame.race();
        racingGame.race();

        assertThat(racingGame.isPlaying()).isTrue();
    }

    @DisplayName("레이싱게임이 끝나지 않았는지 알 수 있다.")
    @Test
    public void isPlayingTest() {
        racingGame.race();

        assertThat(racingGame.isPlaying()).isFalse();
    }

    @DisplayName("우승자를 선별한다.")
    @Test
    public void selectWinnersTest() {
        cars.getCars().get(0).move(true);
        cars.getCars().get(1).move(true);
        cars.getCars().get(1).move(true);

        assertThat(racingGame.selectWinners().get(0).getName()).isEqualTo(winner);
    }
}