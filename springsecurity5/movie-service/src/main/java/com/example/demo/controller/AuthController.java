package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LoginDto;
import com.example.demo.dto.SignUpDto;
import com.example.demo.repository.MovieRepository;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;

import lombok.AllArgsConstructor;

import com.example.demo.model.User;
import com.example.demo.movieService.MovieService;
import com.example.demo.model.Movie;
import com.example.demo.model.Role;
import java.util.Collections;

@RestController
@AllArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {
	
	
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;
    
    private final MovieService movieService;
    
    

    @PostMapping("/signin")
    public ResponseEntity<String> authenticateUser(@RequestBody LoginDto loginDto){
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                loginDto.getUsernameOrEmail(), loginDto.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);
      
        return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody SignUpDto signUpDto,@RequestParam("roleName") String roleName){

        // add check for username exists in a DB
        if(userRepository.existsByUsername(signUpDto.getUsername())){
            return new ResponseEntity<>("Username is already taken!", HttpStatus.BAD_REQUEST);
        }

        // add check for email exists in DB
        if(userRepository.existsByEmail(signUpDto.getEmail())){
            return new ResponseEntity<>("Email is already taken!", HttpStatus.BAD_REQUEST);
        }

        // create user object
        User user = new User();
        user.setName(signUpDto.getName());
        user.setUsername(signUpDto.getUsername());
        user.setEmail(signUpDto.getEmail());
        user.setPassword(passwordEncoder.encode(signUpDto.getPassword()));

        Role roles = roleRepository.findByName(roleName).get();
        user.setRoles(Collections.singleton(roles));

        userRepository.save(user);

        return new ResponseEntity<>("User registered successfully", HttpStatus.OK);

    }
    
    @GetMapping("/movie")
	public ResponseEntity<?> getAllMovie() {
    	
    	
		return ResponseEntity.status(HttpStatus.OK).body(movieService.fetchAllMovie());
    	
    	
    	
	}
    
    @GetMapping("/movie/{id}")
   	public ResponseEntity<?> getMovieById(@PathVariable("id") Integer movieId) {
       	
       	
   		return ResponseEntity.status(HttpStatus.OK).body(movieService.findMovieById(movieId));
       	
       	
       	
   	}
    
    @PostMapping("/movie")
	public ResponseEntity<Movie> createPerson(@RequestBody Movie movie) {

		
	
		
		return ResponseEntity.status(HttpStatus.CREATED).body(movieService.createMovie(movie));
		
	}
    
    @DeleteMapping("/movie/{id}")
   	public ResponseEntity<?> deleteMovieById(@PathVariable("id") Integer movieId) {
       	
       	
   		return ResponseEntity.status(HttpStatus.OK).body(movieService.deleteMovieById(movieId));
       	
       	
       	
   	}
    
    @PutMapping("/movie")
	public ResponseEntity<Movie> createPerson(@PathVariable("id") Integer movieId, @RequestBody Movie movie) {

		
	
		
		return ResponseEntity.status(HttpStatus.CREATED).body(movieService.updateById(movieId, movie));
		
	}
       
    

	
}