package com.cpg.mra.dao;

import com.cpg.mra.bean.Account;
import com.cpg.mra.exceptions.InvalidMobileNumberException;

public interface AccountDao {
	Account getAccountDetails(String mobileNo)throws InvalidMobileNumberException;
	int rechargeAccount(String mobileNo, double rechargeAmount);
	

}
