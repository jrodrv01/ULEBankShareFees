package es.unileon.ulebank.springapp.web;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.ulebank.brokerage.InvestmentAccount;
import es.unileon.ulebank.fees.FeeStrategy;
import es.unileon.ulebank.springapp.domain.Fee;
import es.unileon.ulebank.springapp.service.SimpleChangeFeeManager;

@Controller
public class ChangeSearchFeesController {

    protected final Log logger = LogFactory.getLog(getClass());
    

    @Autowired
    private SimpleChangeFeeManager feeManager;
   
    @Autowired
    private InvestmentAccount account;
    
    @RequestMapping(value="/ShareBuySellView.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String now = (new Date()).toString();
        logger.info("Returning hello view with " + now);
        
        
        Map<String, Object> myModel = new HashMap<String, Object>();
        
        List<Fee> feesArray = feeManager.getShareFees();
        
        
        myModel.put("feeArray", feesArray);


        return new ModelAndView("ShareBuySellView", "model", myModel);

    }
    public void setProductManager(SimpleChangeFeeManager feeManager) {
        this.feeManager = feeManager;
    }
}
