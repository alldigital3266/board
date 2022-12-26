package kr.co.mook.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.mook.member.dao.MemberDAO;
import kr.co.mook.member.vo.MemberVO;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberDAOTest {
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	private MemberDAO dao;
	
	@Ignore
	@Test
	public void selectMemberTest() {
		MemberVO vo = dao.selectMember("aaaa");
		System.out.println(vo);
	}
	
	@Ignore
	@Test
	public void getAllTest() {
		String memName = "o";
		
		List<MemberVO> list = dao.selectAllMember( memName );
		
		for(MemberVO vo : list) {
			System.out.println(vo);
		}
		
	}

	@Ignore
	@Test
	public void selectPasswordMemberTest() {
		Map<String, String> map = new HashMap<>();
		map.put("memId", "alldigital");
		map.put("memPwd", "1234");
		
		MemberVO vo = dao.selectPasswordMember(map);
		
		System.out.println(vo);;
	}
	
	@Test
	public void getTestGetTest() {
		HashMap<String, String> dataMap = new HashMap<>();
		
		dataMap.put("tableName", "members");
		dataMap.put("columnName", "memId");
		dataMap.put("dataValue", "aaaa");

		MemberVO vo = dao.getTestGet(dataMap);
		
		System.out.println(vo);
		
	}
	

}
