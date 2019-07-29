package com.scb.guass.model;

import java.util.ArrayList;
import java.util.List;
public class Groups {
	
	private int groupId;
	private String groupName;
	private String rateId;
	private int settlementacc;
	private int groupBalance;
	private int customerId;
	
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getRateId() {
		return rateId;
	}
	public void setRateId(String rateId) {
		this.rateId = rateId;
	}
	public int getSettlementacc() {
		return settlementacc;
	}
	public void setSettlementacc(int settlementacc) {
		this.settlementacc = settlementacc;
	}
	public int getGroupBalance() {
		return groupBalance;
	}
	public void setGroupBalance(int groupBalance) {
		this.groupBalance = groupBalance;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public List<Accounts> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Accounts> accounts) {
		this.accounts = accounts;
	}
	
	public List<Accounts> getItems() {
		return accounts;
	}
	public void setItems(List<Accounts> accounts) {
		this.accounts = accounts;
	}
	
	private List<Accounts> accounts = new ArrayList<Accounts>();
	public void addItem(Accounts item) {
		accounts.add(item);
	}

	

}

