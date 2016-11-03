package com.jaruiz.springtutorial.chapter02.business;

/**
 * General Account business exception 
 * 
 * @author joalruiz
 *
 */
public class AccountBSException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8370778702019218346L;
	
	/**
	 * Exception code
	 */
	private final Integer code;
	
	/**
	 * Account identifier that produces the exception (if exists)
	 */
	private final Long accountId;

	/**
	 * @param code
	 */
	public AccountBSException(final String message, final Integer code, final Long accountId) {
		super(message);
		this.code = code;
		this.accountId = accountId;
	}

	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @return the accountId
	 */
	public Long getAccountId() {
		return accountId;
	}	
}
