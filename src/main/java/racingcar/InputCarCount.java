package racingcar;

public class InputCarCount {

    private static final String NUMBER_FORMAT_EXCEPTION_MESSAGE = "숫자만 입력이 가능합니다.";
    private static final String ONLY_POSITIVE_MESSAGE = "1 이상의 값만 가능합니다.";
    private int carCount;

    public InputCarCount(String value) {
        int carCount = 0;
        try {
            carCount = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new NumberFormatException(NUMBER_FORMAT_EXCEPTION_MESSAGE);
        }

        if (carCount < 1) {
            throw new IllegalArgumentException(ONLY_POSITIVE_MESSAGE);
        }

        this.carCount = carCount;
    }

}
