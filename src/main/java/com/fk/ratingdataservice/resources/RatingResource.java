package com.fk.ratingdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fk.ratingdataservice.models.Rating;
import com.fk.ratingdataservice.models.UserRating;

@RestController
@RequestMapping("/ratingdata")
public class RatingResource {
	
	
	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating(movieId, -1);
	}
	
	
	@GetMapping("users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating("1", 4),
				new Rating("2", 2)
				);
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		
		
		return userRating;
	}
}
