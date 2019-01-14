package com.lti.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Details")
public class Details {

	@Column(name="loanDetails")
	private LoanDetails loanDetails;
	
	private IncomeDetails incomeDetails;
	
	
}
