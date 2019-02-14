package org.member.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.member.config.MybatisManager;
import org.member.mybatis.vo.ZipCodeVO;
import org.springframework.stereotype.Repository;

@Repository("zdao")
public class ZipcodeDAOImpl implements ZipcodeDAO{
private SqlSession sqlMap; //�̰͵� �������� ���������� ���⼱ ��� ���ϱ� ������ �ؿ� �����ڸ� ������� 
	
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
