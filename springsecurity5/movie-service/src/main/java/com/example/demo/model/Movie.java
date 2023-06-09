package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor         
@AllArgsConstructor        
@Data                      
@Entity                    
@Getter                    
@Setter                    
@Table(name = "movie")      
public class Movie {
	@Id                                                                   
	@GeneratedValue(strategy = GenerationType.AUTO)                       
	@Column(name = "id")                                                  
	private int id;
	@Column(name = "movieId")
	private String movieId;
	@Column(name = "movieName")
	private String movieName;
	@Column(name = "genre")
	private String genre;

}
