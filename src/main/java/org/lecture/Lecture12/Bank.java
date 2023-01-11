package org.lecture.Lecture12;//task 5

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//У нас есть банк , в котором хранятся золотые монеты.
//У банка есть клиенты у которых есть имя и нам как банку важно знать их возраст для ограничений на операции.
//У одного клиента может быть несколько счетов на которых хранятся золотые монеты.
//Нужно реализовать следующую функциональность :
//Найти все счета по клиенту (например List getAccounts(Client client) )
//Найти клиента по счету (например Client findClient(Account account) )
//Поиск должен работать максимально быстро(!!!) с использованием стандартных коллекций Java.
//В классах Client и Account должно быть минимальное кол-во полей, достаточное для этой задачи.
public class Bank {
    private final Map<Account, Client> clientMap = new HashMap<>();
    private final Map<Client, List<Account>> accountMap = new HashMap<>();

    public void putClientMap(Account account, Client client) {
        clientMap.put(account, client);
    }

    public void putAccountMap(Client client, Account account) {
        List<Account> accounts = new ArrayList<>();
        if (accountMap.containsKey(client)) {
            accounts = accountMap.get(client);
            accounts.add(account);
        } else {
            accounts.add(account);
        }
        accountMap.put(client, accounts);
    }

    public Map<Account, Client> getClientMap() {
        return clientMap;
    }

    public Map<Client, List<Account>> getAccountMap() {
        return accountMap;
    }
}
