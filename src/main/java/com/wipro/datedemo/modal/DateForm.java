package com.wipro.datedemo.modal;

import javax.validation.constraints.NotNull;

public class DateForm {
	@NotNull
	private String startDate;
	@NotNull
	private String endDate;
	DateForm(){}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}
