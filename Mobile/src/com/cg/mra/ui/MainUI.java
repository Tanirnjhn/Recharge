package com.cg.mra.ui;

import com.cpg.mra.dao.AccountDaoImpl;
import com.cpg.mra.exceptions.InvalidMobileNumberException;
import com.cpg.mra.service.AccountService;
import com.cpg.mra.service.AccountServiceImpl;

public class MainUI {


	public static void main(String[] args) throws InvalidMobileNumberException 
	{
	AccountService accs= new AccountServiceImpl(new AccountDaoImpl());
System.out.println(accs.getAccountDetails("9010210131"));
System.out.println(accs.getAccountDetails("9823920123"));
System.out.println(accs.rechargeAccount("9932012345", 500));



	}

}
