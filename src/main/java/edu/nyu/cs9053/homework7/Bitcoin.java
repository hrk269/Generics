package edu.nyu.cs9053.homework7;

public class Bitcoin implements Cryptocurrency{

	private final double amount;

	public Bitcoin(double amount) {
		this.amount = amount;
	}

	@Override public double getAmount(){
		return this.amount;
	}

	@Override public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ( (obj == null) || (getClass() != obj.getClass()) ) {
			return false;
		}
		Bitcoin cryptoCurrency = (Bitcoin) obj;
		if (getAmount() != cryptoCurrency.getAmount()) {
			return false;
		}
		return true;
	}

	@Override public int hashCode() {
		Double result = (Double) getAmount();
        return result.hashCode();
	}
}