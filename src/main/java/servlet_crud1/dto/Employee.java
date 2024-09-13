package servlet_crud1.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee {

	@Id
	private int emp_id;
	private String e_name;
	private String position;
	private double salary;

}
