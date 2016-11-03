package com.jaruiz.springtutorial.chapter02.business.impl;

import org.springframework.stereotype.Service;

import com.jaruiz.springtutorial.chapter02.business.AccountBSException;
import com.jaruiz.springtutorial.chapter02.business.IAccountBS;
import com.jaruiz.springtutorial.chapter02.business.model.AccountBO;

/**
 * This is the IAccountBS implementation
 * 
 * @author joalruiz
 *
 */
@Service
public class AccountBS implements IAccountBS {

	@Override
	public Long createAccount(AccountBO newAccountData) throws AccountBSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBO updateAccount(AccountBO updatedAccountData) throws AccountBSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cancelAccount(Long accountId) throws AccountBSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAccount(Long accountId) throws AccountBSException {
		// TODO Auto-generated method stub
		
	}

	
}
