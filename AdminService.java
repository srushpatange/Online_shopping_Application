package com.tnsif.onlineshopping.services;

import java.util.ArrayList;


public class AdminService {
	private List<Admin> adminList = new ArrayList<>();
	
	public void addAdmin(Admin admin) {
		adminList.add(admin);
	}
	public void getAdmin() {
		return adminList;
	}
}
