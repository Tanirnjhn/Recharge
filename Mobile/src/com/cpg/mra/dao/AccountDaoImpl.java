package com.cpg.mra.dao;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

import com.cpg.mra.bean.Account;
import com.cpg.mra.exceptions.InvalidMobileNumberException;

public class AccountDaoImpl implements AccountDao {

	
 Map<String,Account> accountEntry;
  public AccountDaoImpl()
{
	  accountEntry= new HashMap<>();
	  accountEntry.put("9010210131", new Account("Prepaid", "Vaishali",2000));
	  accountEntry.put("9823920123", new Account("Prepaid", "Megha",453));
	  accountEntry.put("9932012345", new Account("Prepaid", "Vikas",631));
	  accountEntry.put("9010210132", new Account("Prepaid", "Anju",521));
	  accountEntry.put("9010210133", new Account("Prepaid", "Tushar",632));
	  
  }
	public Account getAccountDetails(String mobileNo)throws InvalidMobileNumberException {
		for(java.util.Map.Entry<String, Account> entry:accountEntry.entrySet())
		{
			if(entry.getKey().equals(mobileNo))
				return entry.getValue();
			
		}
		throw new InvalidMobileNumberException();
	
	}

	public int rechargeAccount(String mobileNo, double rechargeAmount) {
      Account account= accountEntry.get(mobileNo);
     double acc= account.getAccountBalance()+rechargeAmount;
     return (int)acc;
      
		
	}

}
