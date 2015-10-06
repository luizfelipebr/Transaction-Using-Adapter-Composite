package application;

import java.util.Date;

import transaction.CompoundTransaction;
import transaction.Transaction;
import bank.BankTransaction;

public class AppTransaction implements Transaction{
	private BankTransaction bankTransaction;

	public AppTransaction(BankTransaction bankTransaction) {
		super();
		this.bankTransaction = bankTransaction;
	}

	@Override
	public void execute() {
		bankTransaction.process();
	}

	@Override
	public Date getDate() {
		return bankTransaction.getDate();
	}

	@Override
	public boolean executed() {
		return bankTransaction.processed();
	}

	@Override
	public CompoundTransaction getCompound() {
		return null;
	}

}
