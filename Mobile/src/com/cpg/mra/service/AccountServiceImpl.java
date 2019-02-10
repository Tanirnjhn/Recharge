package com.cpg.mra.service;

import com.cpg.mra.bean.Account;
import com.cpg.mra.dao.AccountDaoImpl;
import com.cpg.mra.exceptions.InvalidMobileNumberException;

public class AccountServiceImpl implements AccountService{
private AccountDaoImpl DAo; 
	public AccountServiceImpl(AccountDaoImpl dAo) {
	super();
	DAo = dAo;
}

	@Override
	public Account getAccountDetails(String mobileNo)throws InvalidMobileNumberException {

		return DAo.getAccountDetails(mobileNo) ;
	}

	@Override
	public int rechargeAccount(String mobileNo, double rechargeAmount) {
		// TODO Auto-generated method stub
		return DAo.rechargeAccount(mobileNo, rechargeAmount);
	}

}
