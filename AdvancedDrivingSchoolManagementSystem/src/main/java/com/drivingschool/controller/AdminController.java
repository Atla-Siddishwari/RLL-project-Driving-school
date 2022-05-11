package com.drivingschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drivingschool.entity.Admin;
import com.drivingschool.service.AdminService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path="/drivingschool")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	//returns list of admins
	@GetMapping("/admin/list")
	public List<Admin> listAdmin()
	{
		return adminService.getAllAdmin();
	}
	
	//update password for admin
	@PutMapping("/admin/updatepwd")
	public Admin updatePwd(@RequestBody Admin admin)
	{
		return adminService.updateAdmin(admin);
	}
}
