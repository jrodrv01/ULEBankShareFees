package es.unileon.ulebank.springapp.service;


import java.util.List;

import es.unileon.ulebank.springapp.domain.Fee;

public class SimpleChangeFeeManager implements ChangeFeeManager {
	
    private static final long serialVersionUID = 1L;
    
    private List<Fee> shareFees;

    public void decreaseFee(double percentage) {
    	if (shareFees != null) {
            for (Fee product : shareFees) {
                double newFee = product.getFeePercentage()* 
                                    (100 - percentage)/100;
                product.setFeePercentage(newFee);
            }
        }  ;        
	}
	
    public void setShareFees (List<Fee> shareFees) {     	
    	this.shareFees = shareFees;
    }
    
    public List<Fee> getShareFees() {
       return this.shareFees;        
    }

	@Override
	public List<Fee> sharesFee() {
		return this.shareFees;
	}
}