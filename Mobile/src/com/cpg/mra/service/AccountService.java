package com.cpg.mra.service;

import com.cpg.mra.bean.Account;
import com.cpg.mra.exceptions.InvalidMobileNumberException;

public interface AccountService {
Account getAccountDetails(String mobileNo)throws InvalidMobileNumberException;
int rechargeAccount(String mobileNo, double rechargeAmount);
}
