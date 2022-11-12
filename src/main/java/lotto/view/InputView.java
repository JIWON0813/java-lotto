package lotto.view;

import java.util.Scanner;

public class InputView {
    private final static Scanner SCANNER = new Scanner(System.in);

    public int purchasePrice(){
        System.out.println("구매금액을 입력해 주세요.");
        return this.initInt();
    }
    
    private int initInt(){
        return SCANNER.nextInt();
    }
}
