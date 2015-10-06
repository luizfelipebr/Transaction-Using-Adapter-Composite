package bank;

import java.math.BigDecimal;
import java.util.Date;

public abstract class BankTransactionImpl implements BankTransaction {
	
	public Account source;
	public Account target;
	public BigDecimal amount;
	public Date date;
	public boolean processed;
		

	protected BankTransactionImpl(Account source, Account target, BigDecimal amount, Date date) {
		super();
		this.source = source;
		this.target = target;
		this.amount = amount;
		this.date = date;
		this.processed = false;
		
	}

	@Override
	public Date getDate() {
		return this.date;
	}

	@Override
	public boolean processed() {
		return this.processed;
	}

	@Override
	public BigDecimal amount() {
		return this.amount;
	}

	@Override
	public Account getSource() {
		return this.source;
	}

	@Override
	public Account getTarget() {
		return this.target;
	}

	
}
