/**
 * 
 */
package com.jaruiz.springtutorial.chapter02.business.model;

import java.util.Calendar;

/**
 * This is the business object representing an account
 * 
 * @author joalruiz
 *
 */
public class AccountBO {

	/**
	 * Account identifier
	 */
	private final Long id;
	
	/**
	 * Email associated to the account
	 */
	private final String email;
	
	/**
	 * Password associated to the account
	 */
	private final String password;
	
	/**
	 * Creation date
	 */
	private Calendar created;
	
	/**
	 * Last access to the account
	 */
	private Calendar lastAccess;
	
	/**
	 * Update date
	 */
	private Calendar updated;
	
	/**
	 * Status 
	 */
	private String status;

	/**
	 * @param id
	 * @param email
	 * @param password
	 * @param created
	 * @param lastAccess
	 * @param updated
	 * @param status
	 */
	public AccountBO(Long id, String email, String password, Calendar created, Calendar lastAccess, Calendar updated,
			String status) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.created = created;
		this.lastAccess = lastAccess;
		this.updated = updated;
		this.status = status;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return the created
	 */
	public Calendar getCreated() {
		return created;
	}

	/**
	 * @return the lastAccess
	 */
	public Calendar getLastAccess() {
		return lastAccess;
	}

	/**
	 * @return the updated
	 */
	public Calendar getUpdated() {
		return updated;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
}
