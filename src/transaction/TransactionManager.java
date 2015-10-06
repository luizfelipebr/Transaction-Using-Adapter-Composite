package transaction;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TransactionManager {
	
	private Set<Transaction> notExecutedSet;
	private Set<Transaction> executedSet;
	
	public TransactionManager(){
		notExecutedSet = new HashSet<Transaction>();
		executedSet = new HashSet<Transaction>();
	}
	
	public void addTransaction(Transaction t){
		notExecutedSet.add(t);
	}
	public void removeTransaction(Transaction t){
		notExecutedSet.remove(t);
	}
	public Iterator<Transaction> getNotExecutedTransactions(){
		return notExecutedSet.iterator();
	}
	public Iterator<Transaction> getExecutedTransactions(){
		return executedSet.iterator();
	}
	public void executeTransactions(){
		Set<Transaction> executedAux = new HashSet<Transaction>();
		Date now = new Date();
		for (Transaction transaction : notExecutedSet) {
			if (!transaction.getDate().after(now)){
				transaction.execute();
				executedAux.add(transaction);
			}
		}
		executedSet.addAll(executedAux);
		notExecutedSet.removeAll(executedAux);
	}
	public void clearExecutedTransactions(){
		executedSet.clear();
		
	}

}
