package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.exception.PositionInvalidException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PositionTest {

    @Test
    @DisplayName("음수으로 포지션 생성시 PositionInvalidException 에러가 발생한다.")
    void positive() {
        assertThatThrownBy(() -> new Position(-1))
                .isInstanceOf(PositionInvalidException.class)
                .hasMessage("포지션 값은 0 이상의 값만 가능합니다.");
    }

    @Test
    @DisplayName("up을 하면 position 이 1 증가한다.")
    void up() {
        Position position = new Position(0);
        position.up();

        assertThat(position).isEqualTo(new Position(1));
    }

    @Test
    @DisplayName("Position 객체를 String 으로 변환 시 Position 의 내부 변수(position)을 반환한다.")
    void positionPrint() {
        assertThat(new Position(1).toString()).isEqualTo("1");
    }

    @Test
    @DisplayName("현재 위치가 움직인 거리와 일치하면 true 를 반환한다.")
    void isSamePosition() {
        int moveDistance = 3;
        assertThat(new Position(3).isSameMoveDistance(moveDistance)).isTrue();
    }

    @Test
    @DisplayName("현재 위치가 움직인 거리와 다르면 false 를 반환한다.")
    void isNotSamePosition() {
        int moveDistance = 2;
        assertThat(new Position(3).isSameMoveDistance(moveDistance)).isFalse();
    }
}