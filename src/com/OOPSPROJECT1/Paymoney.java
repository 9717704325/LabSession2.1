package com.OOPSPROJECT1;

public class Paymoney {

    public int no_of_days(int[] transactions, int target) {

        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] == target || target < transactions[i])
                return i + 1;
            else {
                target = target - transactions[i];
            }
        }
            return -1;

        }
    }

