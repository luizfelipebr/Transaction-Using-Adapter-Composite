package bank;

import java.math.BigDecimal;
import java.util.Date;

public interface BankTransaction {
	public Date getDate();
	public boolean processed();
	public BigDecimal amount();
	public Account getSource();
	public Account getTarget();
	public void process();
}
