package org.lecture.Lecture12;

import java.util.List;

public interface BankManagement {
    Client findClient(Account account);

    List<Account> getAccounts(Client client);
}
