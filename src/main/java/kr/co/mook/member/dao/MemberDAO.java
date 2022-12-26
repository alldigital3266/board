package kr.co.mook.member.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.mook.member.vo.MemberVO;

public interface MemberDAO {
	int insertMember(MemberVO vo);
	int deleteMember(String memId);
	int deleteAlleMember();
	int updateMember(MemberVO vo);
	int getMemberCount();

	MemberVO selectMember(String memId);
	List<MemberVO> selectAllMember(String name);
	MemberVO selectPasswordMember(Map<String, String> mapInfo);
	MemberVO getTestGet(HashMap<String, String> mapData); 

}
