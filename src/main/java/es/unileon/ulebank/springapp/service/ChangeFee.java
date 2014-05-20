package es.unileon.ulebank.springapp.service;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ChangeFee {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    private double percentage;

    public void setPercentage(double i) {
        percentage = i;
        logger.info("Percentage set to " + i);
    }

    public double getPercentage() {
        return percentage;
    }

	
}