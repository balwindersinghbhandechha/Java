/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package deliveryservice.business;

import java.io.Serializable;

/**
 *
 * @author Balwinder Singh Bhandechha
 */
public class Delivery implements Serializable{
    
     //Encapsulate the fields required
    private String strDescription;
    private int deliveryId;
    private double dblShipCost;
    private int sent;
    
    //no args constructor that sets all the intial values
    public Delivery(){
    
    strDescription = "";
    deliveryId = 0;
    dblShipCost = 0;
    sent = 0;
    }
    
    //Overloaded constructor that assigns the values
    public Delivery(String desc, int delId, double shipCost, int sent){
    
        this.strDescription = desc;
        this.deliveryId = delId;
        this.dblShipCost = shipCost;
        this.sent = sent;
    }

     /**
     * Auto Generated Get and Set Methods

    
    /**
     * @return the strDescription
     */
    public String getStrDescription() {
        return strDescription;
    }

    /**
     * @param strDescription the strDescription to set
     */
    public void setStrDescription(String strDescription) {
        this.strDescription = strDescription;
    }

    /**
     * @return the deliveryId
     */
    public int getDeliveryId() {
        return deliveryId;
    }

    /**
     * @param deliveryId the deliveryId to set
     */
    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    /**
     * @return the dblShipCost
     */
    public double getDblShipCost() {
        return dblShipCost;
    }

    /**
     * @param dblShipCost the dblShipCost to set
     */
    public void setDblShipCost(double dblShipCost) {
        this.dblShipCost = dblShipCost;
    }

    /**
     * @return the sent
     */
    public int getSent() {
        return sent;
    }

    /**
     * @param sent the sent to set
     */
    public void setSent(int sent) {
        this.sent = sent;
    }

   
}
