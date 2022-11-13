package org.mycompany.dto;

import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.mycompany.pojo.AdditionalInfo;

public class RegLimitDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotEmpty
	private String partnerReferenceNo;
	@NotEmpty
	private String bankAccountNo;
	@NotEmpty
	private String bankCardNo;
	@NotNull
	private String limit;
	@NotEmpty
	private String bankCardToken;
	@NotEmpty
	private String otp;	
	@Valid
	private AdditionalInfo additionalInfo;
	public String getPartnerReferenceNo() {
		return partnerReferenceNo;
	}
	public void setPartnerReferenceNo(String partnerReferenceNo) {
		this.partnerReferenceNo = partnerReferenceNo;
	}
	public String getBankAccountNo() {
		return bankAccountNo;
	}
	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}
	public String getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public String getBankCardToken() {
		return bankCardToken;
	}
	public void setBankCardToken(String bankCardToken) {
		this.bankCardToken = bankCardToken;
	}
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	public AdditionalInfo getAdditionalInfo() {
		return additionalInfo;
	}
	public void setAdditionalInfo(AdditionalInfo additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
