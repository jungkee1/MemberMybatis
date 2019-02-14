package org.member.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.member.config.MybatisManager;
import org.member.mybatis.vo.MemberVO;
import org.springframework.stereotype.Repository;

@Repository("mado")
public class MemberDAOImpl implements MemberDAO{
	private SqlSession sqlMap; //�̰͵� �������� ���������� ���⼱ ��� ���ϱ� ������ �ؿ� �����ڸ� ������� 
	
	public MemberDAOImpl() {
		SqlSessionFactory sqlMapper = MybatisManager.getMapper();
		sqlMap = sqlMapper.openSession();
	}
	

	
	//��ü����
	@Override
	public List<MemberVO> getMemberList() {
		// TODO Auto-generated method stub
		List<MemberVO> vo = sqlMap.selectList("listMember"); //selectList ���� �ڵ����� list������ ���� �׷��� select�� ����� vo�� ��´�
		return vo;
	}
	
	//�߰��ϱ�
	@Override
	public void insert(MemberVO user) {
		// TODO Auto-generated method stub
		sqlMap.insert("insertMember",user);
		sqlMap.commit();
		
	}

	//�����ϱ�
	@Override
	public void update(MemberVO user) {
		// TODO Auto-generated method stub
		sqlMap.update("updateMember", user);
		sqlMap.commit();
		
	}
	
	//�����ϱ�
	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		sqlMap.delete("deleteMember",id);
		sqlMap.commit();
		
	}

	//�󼼺���
	@Override
	public MemberVO findById(String id) {
		// TODO Auto-generated method stub
		MemberVO vo = sqlMap.selectOne("detailMember", id);
		return vo;
	}
	

}
