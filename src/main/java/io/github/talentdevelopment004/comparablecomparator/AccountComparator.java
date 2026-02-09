package io.github.talentdevelopment004.comparablecomparator;

import java.util.Comparator;

import io.github.talentdevelopment004.datastructures.lists.Account;

public class AccountComparator implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        return o1.getAccountName().compareTo(o2.getAccountName());
    }

}
