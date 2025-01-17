package racingcar.domain.input;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.exception.MaximumCarNameException;
import racingcar.domain.exception.RequiredCarNameException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CarNameTest {

    @Test
    @DisplayName("자동차 이름이 공란인 경우 RequiredCarNameException.class 예외(메시지 '자동차 이름은 필수로 입력해야합니다.')를 반환한다.")
    void inputBlankTest() {
        assertThatThrownBy(() -> new CarName(""))
                .isInstanceOf(RequiredCarNameException.class)
                .hasMessage("자동차 이름은 필수로 입력해야합니다.");
    }

    @Test
    @DisplayName("자동차 이름이 null 인 경우 RequiredCarNameException.class 예외(메시지 '자동차 이름은 필수로 입력해야합니다.')를 반환한다.")
    void inputNullTest() {
        assertThatThrownBy(() -> new CarName(""))
                .isInstanceOf(RequiredCarNameException.class)
                .hasMessage("자동차 이름은 필수로 입력해야합니다.");
    }

    @Test
    @DisplayName("자동차 이름을 6자 이상인 경우 MaximumCarNameException.class 예외(메시지 '자동차의 이름은 5자를 초과할 수 없습니다.')를 반환한다.")
    void maxSizeTest() {
        assertThatThrownBy(() -> new CarName("nextstep"))
                .isInstanceOf(MaximumCarNameException.class)
                .hasMessage("자동차의 이름은 5자를 초과할 수 없습니다.");
    }

    @Test
    @DisplayName("CarName 객체를 String 으로 변환 시 CarName 의 내부 변수(carName)을 반환한다.")
    void carNamePrint() {
        assertThat(new CarName("tom").toString()).isEqualTo("tom");
    }
}