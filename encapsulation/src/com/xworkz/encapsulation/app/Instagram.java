package com.xworkz.encapsulation.app;

public class Instagram {
	
	private String developCompany;
	private int startedYear;
	private String username;
    private int followersCount;
    private int followingCount;
    private boolean isPrivate;
    private double postsPerDay;
    private long totalLikes;
    private String bio;
    private String email;
    private int age;
    private String gender;
    private String city;
    private boolean isVerified;
    
    public String getDevelopCompany() {
    	return this.developCompany;
    }
    
    public void setDevelopCompany(String developCompany) {
    	this.developCompany=developCompany;
    }
    
    public int getStartedYear() {
    	return this.startedYear;
    }
    
    public void setStartedYear(int startedYear) {
    	this.startedYear=startedYear;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public int getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(int followingCount) {
        this.followingCount = followingCount;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public double getPostsPerDay() {
        return postsPerDay;
    }

    public void setPostsPerDay(double postsPerDay) {
        this.postsPerDay = postsPerDay;
    }

    public long getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(long totalLikes) {
        this.totalLikes = totalLikes;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    

}
