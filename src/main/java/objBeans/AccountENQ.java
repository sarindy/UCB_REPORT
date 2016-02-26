package objBeans;

public class AccountENQ {

	// this class store entities of account obj

	private String customerID;
	private String acctNo;
	private String acctName;
	private String custGender;
	private String custSector;
	private String acctCCY;
	private String acctBal;
	private String acctProduct;
	private String acctCompanyCode;

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(String acctNo) {
		this.acctNo = acctNo;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getCustGender() {
		return custGender;
	}

	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}

	public String getCustSector() {
		return custSector;
	}

	public void setCustSector(String custSector) {
		this.custSector = custSector;
	}

	public String getAcctCCY() {
		return acctCCY;
	}

	public void setAcctCCY(String acctCCY) {
		this.acctCCY = acctCCY;
	}

	public String getAcctBal() {
		return acctBal;
	}

	public void setAcctBal(String acctBal) {
		this.acctBal = acctBal;
	}

	public String getAcctProduct() {
		return acctProduct;
	}

	public void setAcctProduct(String acctProduct) {
		this.acctProduct = acctProduct;
	}

	public String getAcctCompanyCode() {
		return acctCompanyCode;
	}

	public void setAcctCompanyCode(String acctCompanyCode) {
		this.acctCompanyCode = acctCompanyCode;
	}

	public AccountENQ(String customerID, String acctNo, String acctName,
			String custGender, String custSector, String acctCCY,
			String acctBal, String acctProduct, String acctCompanyCode) {

		this.customerID = customerID;
		this.acctNo = acctNo;
		this.acctName = acctName;
		this.custGender = custGender;
		this.custSector = custSector;
		this.acctCCY = acctCCY;
		this.acctBal = acctBal;
		this.acctProduct = acctProduct;
		this.acctCompanyCode = acctCompanyCode;
	}

	public AccountENQ() {

	}

}
