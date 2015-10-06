package bank;

import java.math.BigDecimal;

public class Account {
	private BigDecimal balance;
	
	public Account(){
		balance = BigDecimal.ZERO;
	}
	
	public void debit (BigDecimal amount){
		this.balance = this.balance.subtract(amount);
	}
	
	public void credit (BigDecimal amount){
		this.balance = this.balance.add(amount);
	}
	
	public BigDecimal balance(){
		return this.balance;
	}

}
