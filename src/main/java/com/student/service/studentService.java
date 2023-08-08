package com.student.service;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.student.dao.studentdao;
import com.student.exception.globalexception;
import com.student.model.student;
import java.util.*;


public class studentService {

	static Logger log=Logger.getLogger(studentService.class);
	static Scanner bs=new Scanner(System.in);
	static studentService service=new studentService();
	static studentdao dao=new studentdao();
	public void welcome() {
	
		log.info("1 - AddStudent\n2 -Viewstudent\n3 - DeleteStudent");
		int op=0;
		op=bs.nextInt();
		
		switch(op) {
		
		case 1-> service.addStudents();
		case 2->service.getStudents();
		case 3-> {try {service.deleteStudents();} 
		catch (globalexception e){
log.info(e.getMessage());}
		}
		}
	}
	
	public void addStudents() {
		log.info("Enter details to add student\n Enter Name :");
		String stName=bs.next();
		
		student s1=new student();
		s1.setStudentName(stName);
		
		int count=dao.addStudent(s1);
		if(count==1) {
			log.info("Student added successfully");
		}
	}

	public void getStudents() {
		List<student> studentList=dao.getAllStudent();
		for(student s:studentList){
			log.info(s);
		}
	}
	public void deleteStudents() throws globalexception {
		log.info("Enter details to delete \n Enter student id");
		int id=bs.nextInt();
		int count=dao.deleteStudent(id);
		if(count==1) {
			log.info("deleted!....");
		}
		else {
			throw new globalexception("something went wrong");
		}
	}
	
}
