package com.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.*;


@Getter 
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sId;
	private String sName;
	
	;
	public void setStudentName(String stName) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
