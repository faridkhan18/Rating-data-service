package com.fk.ratingdataservice.models;

import java.util.List;

public class UserRating {
	private List<Rating> userRating;

	public UserRating() {

		// TODO Auto-generated constructor stub
	}

	public UserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}

	public List<Rating> getUserRating() {
		return userRating;
	}

	public void setUserRating(List<Rating> userRating) {
		this.userRating = userRating;
	}
	
	
	
}
