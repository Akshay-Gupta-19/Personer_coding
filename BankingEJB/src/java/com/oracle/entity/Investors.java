/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.entity;
import java.util.Date;

public class Investors {
    long investorId;
    String inverstorName;
    String firmName;
    boolean isActive;
    Date lastContacted;
    String title;
    String email;

    public long getInvestorId() {
        return investorId;
    }

    public void setInvestorId(long investorId) {
        this.investorId = investorId;
    }

    public String getInverstorName() {
        return inverstorName;
    }

    public void setInverstorName(String inverstorName) {
        this.inverstorName = inverstorName;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Date getLastContacted() {
        return lastContacted;
    }

    public void setLastContacted(Date lastContacted) {
        this.lastContacted = lastContacted;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
