package org.mybatis.example.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface MyAnnoMapper {
	@Select("select * from names")
	List<String> getNames();
	
	@Insert("insert into names values(#{myname})")
	public void putAll();
}
