package twoYou.in.DataBinding;

import lombok.Data;

@Data
public class CustomerBean {
	
private String custName;
	
private Long custPhoneNo;
	
private String custEmail;

public String getCustName() {
	return custName;
}

public void setCustName(String custName) {
	this.custName = custName;
}

public Long getCustPhoneNo() {
	return custPhoneNo;
}

public void setCustPhoneNo(Long custPhoneNo) {
	this.custPhoneNo = custPhoneNo;
}

public String getCustEmail() {
	return custEmail;
}

public void setCustEmail(String custEmail) {
	this.custEmail = custEmail;
}


	

}
