package org.member.mybatis.mapper;

import java.util.List;

import org.member.mybatis.vo.ZipCodeVO;

public interface ZipcodeDAO {
	List<ZipCodeVO>zipSearch(String dong); 

}
