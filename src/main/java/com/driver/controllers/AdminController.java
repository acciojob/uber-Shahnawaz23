package com.driver.controllers;

import com.driver.model.Customer;
import com.driver.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Driver;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@PostMapping("/register")
	public ResponseEntity<Void> registerAdmin(@RequestBody KafkaProperties.Admin admin){
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<KafkaProperties.Admin> updateAdminPassword(@RequestParam Integer adminId, @RequestParam String password){
		return new ResponseEntity<>(updatedAdmin, HttpStatus.OK);
	}

	@DeleteMapping("/delete")
	public void deleteAdmin(@RequestParam Integer adminId){
	}

	@GetMapping("/listOfCustomers")
	public List<Customer> listOfCustomers() {
		return listOfCustomers;
	}

	@GetMapping("/listOfDrivers")
	public List<Driver> listOfDrivers() {
		return listOfDrivers;
	}
}
