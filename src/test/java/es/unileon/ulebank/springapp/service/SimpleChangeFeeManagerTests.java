package es.unileon.ulebank.springapp.service;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.unileon.ulebank.springapp.domain.Fee;

public class SimpleChangeFeeManagerTests {

    private SimpleChangeFeeManager feeManager;
    
    private List<Fee> products;
    
    private static int PRODUCT_COUNT = 2;
    
    private static Double CHAIR_PRICE = new Double(20.50);
    private static String CHAIR_DESCRIPTION = "Chair";
    
    private static String TABLE_DESCRIPTION = "Table";
    private static Double TABLE_PRICE = new Double(150.10); 
    
    @Before
    public void setUp() throws Exception {
        feeManager = new SimpleChangeFeeManager();
        products = new ArrayList<Fee>();
        
        // stub up a list of products
        Fee product = new Fee();
        product.setDescription("Chair");
        product.setFeePercentage(CHAIR_PRICE);
        products.add(product);
        
        product = new Fee();
        product.setDescription("Table");
        product.setFeePercentage(TABLE_PRICE);
        products.add(product);
        
        feeManager.setShareFees(products);

    }

    @Test
    public void testGetProductsWithNoProducts() {
        feeManager = new SimpleChangeFeeManager();
        assertNull(feeManager.getShareFees());
    }

    /**
     * 
     */
    @Test
    public void testGetProducts() {
        /*List<Fee> products = SimpleChangeFeeManager.getProducts();
        assertNotNull(products);        
        assertEquals(PRODUCT_COUNT, SimpleChangeFeeManager.getProducts().size());*/
    
        Fee product = products.get(0);
        assertEquals(CHAIR_DESCRIPTION, product.getDescription());
        assertEquals(CHAIR_PRICE, product.getFeePercentage());
        
        product = products.get(1);
        assertEquals(TABLE_DESCRIPTION, product.getDescription());
        assertEquals(TABLE_PRICE, product.getFeePercentage());      
    }

}