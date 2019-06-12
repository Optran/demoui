package com.mastercard.ti2019;

public class TransactionNode {
	private TransactionRecordBean bean;
	public TransactionNode(TransactionRecordBean bean) {
		this.bean = bean;
	}
	@Override
	public String toString() {
		return bean.getTransactionRefId();
	}
}
