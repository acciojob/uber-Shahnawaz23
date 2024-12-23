package com.driver.controllers;

import com.driver.model.Customer;
import com.driver.model.Driver;
import com.driver.services.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminServiceImpl adminServiceImpl;

	@PostMapping("/register")
	public ResponseEntity<Void> registerAdmin(@RequestBody KafkaProperties.Admin admin){
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity updateAdminPassword(@RequestParam Integer adminId, @RequestParam String password){
		return new ResponseEntity<>(adminServiceImpl.updatePassword(adminId,password), HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public void deleteAdmin(@RequestParam Integer adminId){
		adminServiceImpl.deleteAdmin(adminId);
	}

	@GetMapping("/listOfCustomers")
	public List<Customer> listOfCustomers() {
		 return adminServiceImpl.getListOfCustomers();
	}

	@GetMapping("/listOfDrivers")
	public List<Driver> listOfDrivers() {

		return adminServiceImpl.getListOfDrivers();
	}
}
