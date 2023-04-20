package com.myspring.protest2.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.protest2.member.vo.MemberVO;

public interface MemberService {
	public List listMembers() throws DataAccessException;
	public int addMember(MemberVO memberVO) throws DataAccessException;
	public int removeMember(String id) throws DataAccessException;
	public MemberVO modMember(String id) throws DataAccessException;
	public int updateMember(MemberVO memberVO) throws DataAccessException;
	public MemberVO login(MemberVO memberVO) throws Exception;
	public MemberVO article(MemberVO memberVO) throws Exception;
}
