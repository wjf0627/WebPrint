package com.webprinter.entity;

import java.net.Socket;

/**
 * 客户端信息
 * @author apple
 *
 */
public class Client {
	private String guid;
	/**
	 *IP地址
	 */
	private String ipAdress;
	public String getGuid() {
		return guid;
	}
	public void setGuid(String guid) {
		guid = guid;
	}
	public String getIpAdress() {
		return ipAdress;
	}
	public void setIpAdress(String ipAdress) {
		this.ipAdress = ipAdress;
	}
	
	
}
