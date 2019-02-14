package org.member.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.member.config.MybatisManager;
import org.member.mybatis.vo.ZipCodeVO;
import org.springframework.stereotype.Repository;

@Repository("zdao")
public class ZipcodeDAOImpl implements ZipcodeDAO{
private SqlSession sqlMap; //이것도 주입으로 가능하지만 여기선 사용 안하기 때문에 밑에 생성자를 만들었음 
	
	public ZipcodeDAOImpl() {
		SqlSessionFactory sqlMapper = MybatisManager.getMapper();
		sqlMap = sqlMapper.openSession();
	}

	@Override
	public List<ZipCodeVO> zipSearch(String dong) {
		// TODO Auto-generated method stub
		List<ZipCodeVO> vo = sqlMap.selectList("zipSearch",dong);
		return vo;
	}

}
