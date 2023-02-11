package model;

import model.global.Account;
import model.global.Entity;
import service.DepositPercentBetService;
import service.FeeService;

import java.util.List;
import java.util.UUID;

public class Bank extends Entity {
    private UUID id;
    private List<Client> clientList;
    private List<Account> accountList;
    private DepositPercentBetService depositPercentBetService;
    private FeeService feeService;
}
