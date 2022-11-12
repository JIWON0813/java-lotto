package lotto.controller;

import lotto.view.InputView;

public class LottoApplication {
    public static void main(String[] args) {
        InputView inputView = new InputView();

        int purchasePrice = inputView.purchasePrice();
    }
}
