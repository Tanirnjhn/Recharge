package com.cg.feedback.bean;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Trainer {
String name;
String courseName;
LocalDate startDate;
LocalDate endDate;
int rating;

DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");
public Trainer() {
	super();
	// TODO Auto-generated constructor stub
}
public Trainer(String name, String courseName,String startDate,
		String endDate, int rating) {
	super();
	this.name = name;
	this.courseName = courseName;
	this.startDate = LocalDate.parse(startDate, formatter);
	this.endDate =  LocalDate.parse(endDate, formatter);
	this.rating = rating;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourseName() {
	return courseName;
}
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
public LocalDate getStartDate() {
	return startDate;
}
public void setStartDate(LocalDate startDate) {
	this.startDate = startDate;
}
public LocalDate getEndDate() {
	return endDate;
}
public void setEndDate(LocalDate endDate) {
	this.endDate = endDate;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public String toString() {
	return "Trainer [name=" + name + ", courseName=" + courseName
			+ ", startDate=" + startDate + ", endDate=" + endDate + ", rating="
			+ rating + "]";
}




}
