package org.study.web;


import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
//테스트 코드를 실핼할 때 스프링이 로딩되도록 하는부분
public class SqlSessionFactoryTest {
	
	@Inject
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void test(){
		System.out.println(sqlFactory);
	}
	

}
