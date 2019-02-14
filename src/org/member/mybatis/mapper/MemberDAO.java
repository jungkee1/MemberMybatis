package org.member.mybatis.mapper;

import java.util.List;

import org.member.mybatis.vo.MemberVO;

public interface MemberDAO {
	
	//��ü����
	List<MemberVO>getMemberList();
	
	//�߰�
	void insert(MemberVO user);
	
	//����
	void update(MemberVO user);
	
	//����
	void delete(String id);
	
	//�󼼺���
	MemberVO findById(String id);

}
