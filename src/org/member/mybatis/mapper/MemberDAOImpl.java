package org.member.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.member.config.MybatisManager;
import org.member.mybatis.vo.MemberVO;
import org.springframework.stereotype.Repository;

@Repository("mado")
public class MemberDAOImpl implements MemberDAO{
	private SqlSession sqlMap; //이것도 주입으로 가능하지만 여기선 사용 안하기 때문에 밑에 생성자를 만들었음 
	
	public MemberDAOImpl() {
		SqlSessionFactory sqlMapper = MybatisManager.getMapper();
		sqlMap = sqlMapper.openSession();
	}
	

	
	//전체보기
	@Override
	public List<MemberVO> getMemberList() {
		// TODO Auto-generated method stub
		List<MemberVO> vo = sqlMap.selectList("listMember"); //selectList 쓰면 자동으로 list형으로 받음 그래서 select한 결과를 vo에 담는다
		return vo;
	}
	
	//추가하기
	@Override
	public void insert(MemberVO user) {
		// TODO Auto-generated method stub
		sqlMap.insert("insertMember",user);
		sqlMap.commit();
		
	}

	//수정하기
	@Override
	public void update(MemberVO user) {
		// TODO Auto-generated method stub
		sqlMap.update("updateMember", user);
		sqlMap.commit();
		
	}
	
	//삭제하기
	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		sqlMap.delete("deleteMember",id);
		sqlMap.commit();
		
	}

	//상세보기
	@Override
	public MemberVO findById(String id) {
		// TODO Auto-generated method stub
		MemberVO vo = sqlMap.selectOne("detailMember", id);
		return vo;
	}
	

}
