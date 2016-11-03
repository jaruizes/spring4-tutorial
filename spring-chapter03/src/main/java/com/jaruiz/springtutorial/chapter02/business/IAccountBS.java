package com.jaruiz.springtutorial.chapter02.business;

import com.jaruiz.springtutorial.chapter02.business.model.AccountBO;

/**
 * This is the Account Service. 
 * Its main responsibility is managing users account
 * - Create: creates a new account 
 * - Update: updates an existing account
 * - Cancel: cancels an account, not deleting it
 * - Delete: removes, physically, an account
 * 
 * @author joalruiz
 *
 */
public interface IAccountBS {
	
	Long createAccount(final AccountBO newAccountData) throws AccountBSException;
	AccountBO updateAccount(final AccountBO updatedAccountData) throws AccountBSException;
	String cancelAccount(final Long accountId) throws AccountBSException;
	void deleteAccount(final Long accountId) throws AccountBSException;

}
