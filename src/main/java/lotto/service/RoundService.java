package lotto.service;

import lotto.domain.Lotto;

import java.util.ArrayList;
import java.util.List;

public class RoundService {
    private List<Lotto> lottos;

    public RoundService(int price) {
        lottos = new ArrayList<>();

        butLotto(price);
    }

    private void butLotto(int price) {
        int count = price / 1000;

        for (int i = 0; i < count; i++) {
            lottos.add(new Lotto());
        }
    }

    public void round(){

    }
}
