package com.driver.services;

import java.util.List;
import java.util.Optional;

import com.driver.model.Admin;
import com.driver.model.Customer;
import com.driver.model.Driver;

public interface AdminService {

	public void adminRegister(Admin admin);

	public Optional<Admin> updatePassword(Integer adminId, String password);

	public void deleteAdmin(int adminId);

	public List<Driver> getListOfDrivers();
	
	public List<Customer> getListOfCustomers();
}
