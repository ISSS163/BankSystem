package middleware;

import model.global.Account;

import java.util.Date;
import java.util.UUID;

public class Transaction {
    private UUID id;
    private Date date;
    private Account accountProducer;
    private Account accountConsumer;
    private Double amount;
}
