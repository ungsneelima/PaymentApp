package pmt;

public class BankAccount{
    private final long bankAcctId;
    private final String acctNumber;
    private final String ifscCode;
    private BankAccountStatusEnum acctStatus; 
    private final String bankName;
    private final String branch;
    private final User user;

    public BankAccount(long bankAcctId, String acctNumber, String ifscCode, BankAccountStatusEnum acctStatus, 
                       String bankName, String branch, User user) {
        this.bankAcctId = bankAcctId;
        this.acctNumber = acctNumber;
        this.ifscCode = ifscCode;
        this.acctStatus = acctStatus;
        this.bankName = bankName;
        this.branch = branch;
        this.user = user;
    }
    
   public BankAccount() {
		this.bankAcctId = 0;
		this.acctNumber = "";
		this.ifscCode = "";
		this.bankName = "";
		this.branch = "";
		this.user = new User();
		this.acctStatus =null;
        
    }

    
    public long getBankAcctId() {
        return bankAcctId;
    }

    public String getAcctNumber() {
        return acctNumber;
    }

    public String getIfscCode() {
        return ifscCode;
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

    public String getBranch() {
        return branch;
    }

    public User getUser() {
        return user;
    }
}
