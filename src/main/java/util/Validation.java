package util;

import domain.LottoAmount;
import domain.Money;

import static domain.LottoAmount.isAmountPositive;
import static domain.LottoNo.MAX_NUMBER;
import static domain.LottoNo.MIN_NUMBER;
import static domain.Money.isMoneyPositive;

public class Validation {

    public static void validatePurchaseMoney(Money money){
        if(!isMoneyPositive(money))
            throw new RuntimeException("구입금액이 올바르게 입력되지 않았습니다.");
    }

    public static void validatePurchaseAmount(LottoAmount amount){
        if(!isAmountPositive(amount))
            throw new RuntimeException("로또 수가 올바르게 입력되지 않았습니다.");
    }

    public static void validateLottoNo(int number){
        if(MIN_NUMBER > number || MAX_NUMBER > number)
            throw new RuntimeException("로또 번호가 올바르게 입력되지 않았습니다.");
    }
}
