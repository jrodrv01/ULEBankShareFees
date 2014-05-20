package es.unileon.ulebank.fees;

import es.unileon.ulebank.springapp.domain.Fee;

/**
 * Simple fee that applies a minimum plus a percentage of the given amount.
 * 
 * @author roobre
 */
public class LinearFee implements FeeStrategy {

	/**
	 * Fee to be applied as amount multiplicator, THUS ONE (a 2% fee is storead
	 * as 0.02).
	 */
	private double fee;

	public double getFee() {
		return this.fee;
	}

	/**
	 * Minimum value which is always paid.
	 */
	public LinearFee() {
		// TODO Auto-generated constructor stub
	}

	private double minimum;

	public LinearFee(double fee, double minimum) throws InvalidFeeException {
		if (fee < 0 || minimum < 0) {
			throw new InvalidFeeException();
		}

		this.fee = fee;
		this.minimum = minimum;
	}

	public double getFee(double value) {
		double total = this.fee * value;
		if (total < this.minimum) {
			total = this.minimum;
		}

		return total;

	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public double getMinimum() {
		return minimum;
	}

	public void setMinimum(double minimum) {
		this.minimum = minimum;
	}

}
