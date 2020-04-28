package com.cy.pj.activity.pojo;

import java.time.LocalDateTime;

public class Activity {
private Long id;
private String title;
private String category;
private LocalDateTime startTime;
private LocalDateTime endTime;
private String remark;
private Integer state=1;
private LocalDateTime createdTime;
private String createUser;

public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}

public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}

public LocalDateTime getStartTime() {
	return startTime;
}
public void setStartTime(LocalDateTime startTime) {
	this.startTime = startTime;
}
public LocalDateTime getEndTime() {
	return endTime;
}
public void setEndTime(LocalDateTime endTime) {
	this.endTime = endTime;
}
public LocalDateTime getCreatedTime() {
	return createdTime;
}
public void setCreatedTime(LocalDateTime createdTime) {
	this.createdTime = createdTime;
}
public String getCreateUser() {
	return createUser;
}
public void setCreateUser(String createUser) {
	this.createUser = createUser;
}
@Override
public String toString() {
	return "Activity [id=" + id + ", title=" + title + ", category=" + category + ", startTime=" + startTime
			+ ", endTime=" + endTime + ", remark=" + remark + ", state =" + state + ", createdTime=" + createdTime
			+ ", createUser=" + createUser + "]";
}


}
