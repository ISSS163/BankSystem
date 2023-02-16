package model.global;

import model.global.base.Entity;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Account extends Entity {
    private UUID id;
    private Double balance;

    public abstract void put(Double amount);

    public abstract void withdraw(Double amount);
}
