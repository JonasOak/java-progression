package entities;

public final class BusinessAccount extends Account {
	/* Há a possibilidade de adicionar um final antes do class, para declarar impedir que esta
	   classe seja herdada por uma subclasse. É possível fazer com métodos também.
	 */
	private Double loanlimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanlimit) {
		super(number, holder, balance);
		this.loanlimit = loanlimit;
	}

	public Double getLoanlimit() {
		return loanlimit;
	}

	public void setLoanlimit(Double loanlimit) {
		this.loanlimit = loanlimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanlimit) {
			balance += amount - 10.0;
		}
		else {
			System.out.println("Limit Exceded!");
		}
	}
	
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	public String toString() {
        return "Number: " + getNumber() +
        		"\nHolder: " + getHolder() +
        		"\nBalance: " + String.format("%.2f", getBalance()) +
        		"\nLoanLimit: " + String.format("%.2f", getLoanlimit());
    }
}
