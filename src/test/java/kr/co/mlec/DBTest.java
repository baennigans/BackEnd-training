package kr.co.mlec;

import static org.junit.Assert.assertNotNull;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring/spring-mvc.xml"})
public class DBTest {

	@Autowired
	private DataSource ds;
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Ignore
	@Test
	public void dataSource테스트() throws Exception {
		assertNotNull(ds);
		System.out.println(ds);
	}
	
	public void sqlSession테스트() throws Exception{
		assertNotNull(session);
	}
	
	
	
	
}






