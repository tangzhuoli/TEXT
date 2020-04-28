package com.cy.pj.activity.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.cy.pj.activity.pojo.Activity;

@Mapper
public interface ActivityDao {
	@Select("select * from tb_activity")
List<Activity> findActivitys();
}
