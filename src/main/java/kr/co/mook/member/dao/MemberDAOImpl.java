package kr.co.mook.member.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.mook.member.vo.MemberVO;
@Repository
public class MemberDAOImpl implements MemberDAO {
	@Autowired
	SqlSession session;
	
	@Override
	public int insertMember(MemberVO vo) {
		return session.update("memberNS.addOne", vo);
	}

	@Override
	public int deleteMember(String memId) {
		return session.update("memberNS.delOne", memId);
	}

	@Override
	public int deleteAlleMember() {
		return session.update("memberNS.delAll");
	}

	@Override
	public int updateMember(MemberVO vo) {
		return session.update("memberNS.update", vo);
	}

	@Override
	public MemberVO selectMember(String memId) {
		return session.selectOne("memberNS.getOne",memId);
	}

	@Override	
	public MemberVO selectPasswordMember(Map<String, String> mapInfo) {
		return session.selectOne("memberNS.getOnePass", mapInfo);
	}
	
	@Override
	public List<MemberVO> selectAllMember(String name) {
		
		return session.selectList("memberNS.getAll", name);
	}

	@Override
	public MemberVO getTestGet(HashMap<String, String> mapData){
		return session.selectOne("memberNS.testGet", mapData);
	}
	
	@Override
	public int getMemberCount() {
		return session.selectOne("memberNS.getCount");
	}


}
