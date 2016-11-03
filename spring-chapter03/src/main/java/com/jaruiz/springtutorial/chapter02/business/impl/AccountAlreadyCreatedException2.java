package com.jaruiz.springtutorial.chapter02.business.impl;

import com.jaruiz.springtutorial.chapter02.business.AccountBSException;

/**
 * Exception threw when the account doesn't exists in the system.
 * 
 * @author joalruiz
 *
 */
public class AccountAlreadyCreatedException2 extends AccountBSException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7314774715511021377L;
	private static final String MESSAGE = "Account already created";
	
	public AccountAlreadyCreatedException2(String message, Integer code, Long accountId) {
		super(MESSAGE, code, accountId);		
	}
}
