package com.jdbc.dao;

import java.util.List;
import com.jdbc.dto.VO;

//기능서비스를 위한 인터페이스
public interface DAO<E extends VO> {
	List<E> selectList()throws Exception;
	E selectById(String id)throws Exception;
	void insert(E e)throws Exception;
	void update(E e)throws Exception;
	void delete(String id)throws Exception;
	
}
