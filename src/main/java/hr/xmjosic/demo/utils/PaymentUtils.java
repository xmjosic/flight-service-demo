package hr.xmjosic.demo.utils;

import hr.xmjosic.demo.exception.InsufficientFundsException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String, Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("acc1", 1000.0);
        paymentMap.put("acc2", 5000.0);
        paymentMap.put("acc3", 100.0);
        paymentMap.put("acc4", 1200.0);
        paymentMap.put("acc5", 1500.0);
    }

    public static boolean validateCreditLimit(String accountNo, Double paidAmount) {
        if (paidAmount > paymentMap.get(accountNo)) {
            throw new InsufficientFundsException("Insufficient fund!");
        } else {
            return true;
        }
    }
}
