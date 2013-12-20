/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.flooring.model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author apprentice
 */
public class Order {
    private int orderId;
    private int custId;
    private int productId;
    private double area;
    final private static String CUR_DATE = new SimpleDateFormat("MMddyyyy").format(new Date());
    private BigDecimal prodTotal;
    private BigDecimal laborSubTotal;
    private BigDecimal taxSubTotal;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public BigDecimal getProdTotal() {
        return prodTotal;
    }

    public void setProdTotal(BigDecimal prodTotal) {
        this.prodTotal = prodTotal;
    }

    public BigDecimal getLaborSubTotal() {
        return laborSubTotal;
    }

    public void setLaborSubTotal(BigDecimal laborSubTotal) {
        this.laborSubTotal = laborSubTotal;
    }

    public BigDecimal getTaxSubTotal() {
        return taxSubTotal;
    }

    public void setTaxSubTotal(BigDecimal taxSubTotal) {
        this.taxSubTotal = taxSubTotal;
    }
    
}
