package com.jdbc.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.jdbc.dao.고객DAO;
import com.jdbc.dao.제품DAO;
import com.jdbc.dao.주문DAO;
import com.jdbc.datasource.DataSource;
import com.jdbc.dto.고객VO;
import com.jdbc.dto.제품VO;
import com.jdbc.dto.주문VO;


public class Test고객DAO {
	
	private DataSource dataSource;
	private 고객DAO dao = new 고객DAO();//결합도 강하게
	private 제품DAO dao1 = new 제품DAO();
	private 주문DAO dao2 = new 주문DAO()
;	@Before
	public void init() {
		dataSource = MocDataSource.getInstance();
		dao.setDataSource(dataSource);
		dao1.setDataSource(dataSource);
		dao2.setDataSource(dataSource);
	}
		
	
	@Test
	public void test고객리스트() throws Exception{
		List<고객VO> 고객리스트 =dao.selectList();
		
		Assert.assertEquals(2,고객리스트.size());
	}
	@Test
	
	public void test제품리스트() throws Exception{
		List<제품VO> 제품리스트 = dao1.selectList();
		
		Assert.assertEquals(7,제품리스트.size());
	}
	
	@Test
	public void test주문리스트() throws Exception{
		List<주문VO> 주문리스트 =  dao2.selectList();
		
		Assert.assertEquals(10, 주문리스트.size());
	}
}
