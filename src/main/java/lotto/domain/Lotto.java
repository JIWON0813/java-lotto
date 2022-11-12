package lotto.domain;

import java.util.Collections;
import java.util.List;
import java.util.stream.*;

public class Lotto {
    private static final List<Integer> LOTTO_NUMBER = IntStream.rangeClosed(1,45).boxed().collect(Collectors.toList());
    private List<Integer> lotto;

    public Lotto() {
        Collections.shuffle(LOTTO_NUMBER);
        lotto = LOTTO_NUMBER.subList(0,6);
    }

    public int matchCount(List<Integer> lotto){
        return this.lotto.stream().map(number -> lotto.stream().anyMatch(otherNumber -> otherNumber == number))
                            .collect(Collectors.toList())
                            .size();
    }
}
