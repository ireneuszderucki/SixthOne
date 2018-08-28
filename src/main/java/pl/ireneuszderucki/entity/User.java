package pl.ireneuszderucki.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;


@Entity
@Table(name="users")
public @Data class User {
	
	@Id
	@NotBlank
	private int id;
	
	@NotBlank
	private String name;
	

}
