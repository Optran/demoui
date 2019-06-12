package com.mastercard.ti2019;

public class TransactionRecordBean {
	private String transactionRefId;
	private String sourceAccountIdentifier;
	private String sourceBankIdentifier;
	private String sourceCountryIdentifier;
	private String targetAccountIdentifier;
	private String targetBankIdentifier;
	private String targetCountryIdentifier;
	private String transactionAmount;
	private String transactionCurrencyCode;
	private String localTransactionDateTime;
	public String getTransactionRefId() {
		return transactionRefId;
	}
	public void setTransactionRefId(String transactionRefId) {
		this.transactionRefId = transactionRefId;
	}
	public String getSourceAccountIdentifier() {
		return sourceAccountIdentifier;
	}
	public void setSourceAccountIdentifier(String sourceAccountIdentifier) {
		this.sourceAccountIdentifier = sourceAccountIdentifier;
	}
	public String getSourceBankIdentifier() {
		return sourceBankIdentifier;
	}
	public void setSourceBankIdentifier(String sourceBankIdentifier) {
		this.sourceBankIdentifier = sourceBankIdentifier;
	}
	public String getSourceCountryIdentifier() {
		return sourceCountryIdentifier;
	}
	public void setSourceCountryIdentifier(String sourceCountryIdentifier) {
		this.sourceCountryIdentifier = sourceCountryIdentifier;
	}
	public String getTargetAccountIdentifier() {
		return targetAccountIdentifier;
	}
	public void setTargetAccountIdentifier(String targetAccountIdentifier) {
		this.targetAccountIdentifier = targetAccountIdentifier;
	}
	public String getTargetBankIdentifier() {
		return targetBankIdentifier;
	}
	public void setTargetBankIdentifier(String targetBankIdentifier) {
		this.targetBankIdentifier = targetBankIdentifier;
	}
	public String getTargetCountryIdentifier() {
		return targetCountryIdentifier;
	}
	public void setTargetCountryIdentifier(String targetCountryIdentifier) {
		this.targetCountryIdentifier = targetCountryIdentifier;
	}
	public String getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionCurrencyCode() {
		return transactionCurrencyCode;
	}
	public void setTransactionCurrencyCode(String transactionCurrencyCode) {
		this.transactionCurrencyCode = transactionCurrencyCode;
	}
	public String getLocalTransactionDateTime() {
		return localTransactionDateTime;
	}
	public void setLocalTransactionDateTime(String localTransactionDateTime) {
		this.localTransactionDateTime = localTransactionDateTime;
	}
}
