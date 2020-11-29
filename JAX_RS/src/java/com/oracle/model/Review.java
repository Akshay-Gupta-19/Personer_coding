package com.oracle.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Review {
private int reviewId;
private String comments;
private int ratings;
public Review() {
	// TODO Auto-generated constructor stub
}
public Review(int reviewId, String comments, int ratings) {
	super();
	this.reviewId = reviewId;
	this.comments = comments;
	this.ratings = ratings;
}
public int getReviewId() {
	return reviewId;
}
public void setReviewId(int reviewId) {
	this.reviewId = reviewId;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}
public int getRatings() {
	return ratings;
}
public void setRatings(int ratings) {
	this.ratings = ratings;
}



}
