package model;

import middleware.Validator;
import model.global.Account;
import model.global.base.Entity;

import java.util.UUID;

public class Client extends Entity {
    private UUID id;

    private String firstName;

    private String lastName;

    private String address;

    private String passport;

    private Account account;

    private Bank bank;

    public Client(UUID id,
                  String firstName,
                  String lastName,
                  String address,
                  String passport,
                  Account account,
                  Bank bank) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.passport = passport;
        this.account = account;
        this.bank = bank;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPassport() {
        return passport;
    }

    public Account getAccount() {
        return account;
    }

    public Bank getBank() {
        return bank;
    }

    public static class ClientBuilder {
        private String firstName;

        private String lastName;

        private String address;

        private String passport;

        private Account account;

        private Bank bank;

        public void setBank(Bank bank) {
            Validator.validate(bank);
            this.bank = bank;
        }

        public ClientBuilder setName(String firstName)
        {
            Validator.validate(firstName);
            this.firstName = firstName;
            return this;
        }

        public ClientBuilder setSurname(String lastName)
        {
            Validator.validate(lastName);
            this.lastName = lastName;
            return this;
        }

        public ClientBuilder setPassport(String passport)
        {
            Validator.validate(passport);
            this.passport = passport;
            return this;
        }

        public ClientBuilder setAddress(String address)
        {
            Validator.validate(address);
            this.address = address;
            return this;
        }

        public ClientBuilder setAccount(Account account) {
            Validator.validate(account);
            this.account = account;
            return this;
        }

        public Client build() {
            return new Client(UUID.randomUUID(), firstName, lastName, address, passport, account, bank);
        }

    }
}
