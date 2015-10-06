package transaction;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CompoundTransaction implements Transaction {
	
	private Date date;
	private boolean executed;
	private List<Transaction> children;

	public CompoundTransaction(Date date) {
		super();
		this.date = date;
		this.executed = false;
		this.children = new ArrayList<Transaction>();
	}
	
	public void add(Transaction child){
		if(this.date.after(child.getDate())){
			this.children.add(child);
		}
	}
	
	public void remove(Transaction child){
		this.children.remove(child);
	}
	
	public Iterator<Transaction> getChildren(){
		return children.iterator();
	}

	public void setExecuted(boolean executed) {
		this.executed = executed;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public void execute() {
		for (Transaction child : this.children){
			child.execute();
		}
		this.setExecuted(true);
	}

	@Override
	public Date getDate() {			
		return Date.from(this.date.toInstant());
	}

	@Override
	public boolean executed() {
		return executed;
	}

	@Override
	public CompoundTransaction getCompound() {
		return this;
	}

}
