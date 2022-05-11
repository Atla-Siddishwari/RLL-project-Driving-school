package com.drivingschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drivingschool.entity.Students;
import com.drivingschool.service.StudentsService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping(path="/drivingschool")
public class StudentsController {

	@Autowired
	private StudentsService studentsService;
	
	//insert new student
	@PostMapping("/student/insert")
	public Students addStudent(@RequestBody Students students)
	{
		return studentsService.addNewStudent(students);
	}
	
	//returns a list of students
	@GetMapping("/student/list")
	public List<Students> listStudents()
	{
		return studentsService.getAllStudents();
	}
	
	//update password for student
	@PutMapping("/student/updatepwd")
	public Students updatePwd(@RequestBody Students students)
	{
		return studentsService.updateStudentPwd(students);
	}
	
	//edit student details
	@PutMapping("/student/edit")
	public Students updateStudent(@RequestBody Students students)
	{
		return studentsService.updateStudentDetails(students);
	}
	
	//insert package details chosen by the student
	@PutMapping("/student/package")
	public Students updateStudentPackage(@RequestBody Students students)
	{
		return studentsService.updateStudentPackageDetails(students);
	}
	
	//get final booking details for student
	@PutMapping("/student/bookingdetails")
	public List<String> bookingDetails(@RequestBody Students students)
	{
		return studentsService.getBookingDetails(students);
	}
	
	//remove student
	@PutMapping("/student/remove")
	public void removeStudent(@RequestBody Students students)
	{
		studentsService.removeStudentDetails(students);
	}
	
}
