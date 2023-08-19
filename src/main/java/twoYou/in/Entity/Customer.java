package twoYou.in.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Customer_Details")
public class Customer {

	@Id
	@GeneratedValue
	private Long custId;

	private String custName;

	private Long custPhoneNo;

	private String custEmail;

	@ManyToOne
	@JoinColumn(unique=true)
	private Address custAddress;
	

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

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

	public Address getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}
	
	

}
