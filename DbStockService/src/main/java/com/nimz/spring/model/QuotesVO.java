package com.nimz.spring.model;

import java.util.List;

public class QuotesVO {

	private String userName;
	private List<String> quotes;

	public QuotesVO() {
	}

	public QuotesVO(String userName, List<String> quotes) {
		this.userName = userName;
		this.quotes = quotes;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<String> getQuotes() {
		return quotes;
	}

	public void setQuotes(List<String> quotes) {
		this.quotes = quotes;
	}
}
