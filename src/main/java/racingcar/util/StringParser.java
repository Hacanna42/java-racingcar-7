package racingcar.util;

import java.util.List;

public class StringParser {
    private static final String DELIMITER = ",";

    public List<String> makeList(String input) {
        return List.of(input.split(DELIMITER));
    }
}