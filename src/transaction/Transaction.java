package transaction;

import java.util.Date;

public interface Transaction {
	public void execute();
	public Date getDate();
	public boolean executed();
	public CompoundTransaction getCompound();

}
