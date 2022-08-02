package com.example.tutorial_app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tutorials")
@ToString
@EqualsAndHashCode
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter @Setter
	private Long id;
	
	@Column(name = "title")
	@Getter @Setter
	private String title;
	
	@Column(name = "description")
	@Getter @Setter
	private String description;
	
	@Column(name = "published")
	@Getter @Setter
	private Boolean published;

	public Tutorial() {}
	
	public Tutorial(String title, String description, Boolean published) {
		this.title = title;
		this.description = description;
		this.published = published;
	}
	
}
