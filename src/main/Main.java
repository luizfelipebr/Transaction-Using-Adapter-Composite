package main;

import java.math.BigDecimal;
import java.util.Date;

import application.AppTransaction;
import bank.Account;
import bank.BankTransactionImpl;
import transaction.TransactionManager;

public class Main {

	public static void main(String[] args) {
		Account A = new Account();
		Account B = new Account();
		Account C = new Account();
		TransactionManager manager = new TransactionManager();
		
		A.credit(new BigDecimal(1000000));
		B.debit(new BigDecimal(2000));
		
		

}
