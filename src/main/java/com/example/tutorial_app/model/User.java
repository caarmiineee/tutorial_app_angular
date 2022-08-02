package com.example.tutorial_app.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

//@Entity
//@Table(name = "users",
//       uniqueConstraints = {
//           @UniqueConstraint(columnNames = "username"),
//           @UniqueConstraint(columnNames = "email")
//       })
public class User {

//	@Id
//	  @GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Getter @Setter  
//	private Long id;
//	
//	@NotBlank
//	  @Size(max = 20)
//	@Getter @Setter 
//	private String username;
//	 
//	@NotBlank
//	  @Size(max = 50)
//	  @Email
//	  @Getter @Setter 
//	  private String email;
//	  
//	@NotBlank
//	  @Size(max = 120)
//	  private String password;
//	  @ManyToMany(fetch = FetchType.LAZY)
//	  @JoinTable(name = "user_roles", 
//	             joinColumns = @JoinColumn(name = "user_id"),
//	             inverseJoinColumns = @JoinColumn(name = "role_id"))
//	  private Set<Role> roles = new HashSet<>();
//	  public User() {
//	  }
//	  public User(String username, String email, String password) {
//	    this.username = username;
//	    this.email = email;
//	    this.password = password;
//	  }
	  
}
