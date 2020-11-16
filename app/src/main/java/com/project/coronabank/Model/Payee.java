package com.project.coronabank.Model;

/**
 * Created by Melvin Kisten 201700476
 */

public class Payee {

    private String payeeID;
    private String payeeName;
    private long dbId;

    public Payee(String payeeID, String payeeName) {
        this.payeeID = payeeID;
        this.payeeName = payeeName;
    }

    public Payee(String payeeID, String payeeName, long dbId) {
        this(payeeID, payeeName);
        this.dbId = dbId;
    }


    public String getPayeeName() {
        return payeeName;
    }

    public String getPayeeID() {
        return payeeID;
    }

    public void setDbId(long dbId) {
        this.dbId = dbId;
    }

    public String toString() {
        return (payeeName + " (" + payeeID + ")");
    }
}
