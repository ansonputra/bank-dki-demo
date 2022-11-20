package org.mycompany.dto;

import java.io.Serializable;

import javax.validation.Valid;

import org.hibernate.validator.constraints.Length;
import org.mycompany.pojo.AdditionalInfo;

public class TransactionHistoryListDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Length(min = 3, max = 64)
	private String partnerReferenceNo;
	@Length(min = 3, max = 25)
	private String fromDateTime;
	@Length(min = 3, max = 25)
	private String toDateTime;
	@Length(min = 1, max = 2)
	private String pageSize;
	@Length(min = 1, max = 2)
	private String pageNumber;
	@Valid
	private AdditionalInfo additionalInfo;
	
	public String getPartnerReferenceNo() {
		return partnerReferenceNo;
	}
	public void setPartnerReferenceNo(String partnerReferenceNo) {
		this.partnerReferenceNo = partnerReferenceNo;
	}
	public String getFromDateTime() {
		return fromDateTime;
	}
	public void setFromDateTime(String fromDateTime) {
		this.fromDateTime = fromDateTime;
	}
	public String getToDateTime() {
		return toDateTime;
	}
	public void setToDateTime(String toDateTime) {
		this.toDateTime = toDateTime;
	}
	public String getPageSize() {
		return pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
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
