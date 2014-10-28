/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.fileservices;

/**
 * The type Drive Quota.
*/
public class DriveQuota extends ODataBaseEntity {

	public DriveQuota(){
		setODataType("#Microsoft.FileServices.DriveQuota");
	}


	private long deleted;

	/**
	* Gets the deleted.
	*
	* @return the long
	*/
	public long getdeleted() {
		return this.deleted; 
	}

	/**
	* Sets the deleted.
	*
	* @param value the long
	*/
	public void setdeleted(long value) { 
		this.deleted = value; 
	}

	private long remaining;

	/**
	* Gets the remaining.
	*
	* @return the long
	*/
	public long getremaining() {
		return this.remaining; 
	}

	/**
	* Sets the remaining.
	*
	* @param value the long
	*/
	public void setremaining(long value) { 
		this.remaining = value; 
	}

	private String state;

	/**
	* Gets the state.
	*
	* @return the String
	*/
	public String getstate() {
		return this.state; 
	}

	/**
	* Sets the state.
	*
	* @param value the String
	*/
	public void setstate(String value) { 
		this.state = value; 
	}

	private long total;

	/**
	* Gets the total.
	*
	* @return the long
	*/
	public long gettotal() {
		return this.total; 
	}

	/**
	* Sets the total.
	*
	* @param value the long
	*/
	public void settotal(long value) { 
		this.total = value; 
	}
}