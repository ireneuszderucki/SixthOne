package pl.ireneuszderucki.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;


@Entity
@Table(name="users")
public @Data class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotBlank
	private int id;
	
	@NotBlank
	private String name;
	

}
