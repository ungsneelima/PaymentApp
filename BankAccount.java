package com.sat.tmf.pmt.entity;

public class BankAccount {
    private long bankAcctId;
    private String acctNumber;
    private String ifscCode;
    //	private String acctStatus;
    private BankAccountStatusEnum acctStatus;
    private String bankName;
    private String branch;

    private User user; 

    public long getBankAcctId() {
        return bankAcctId;
    }

    public void setBankAcctId(long bankAcctId) {
        this.bankAcctId = bankAcctId;
    }

    public String getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public BankAccountStatusEnum getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(BankAccountStatusEnum acctStatus) {
        this.acctStatus = acctStatus;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
