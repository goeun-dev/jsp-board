package org.blog.test;

import java.io.Console;

import org.blog.dao.BoardDAO;
import org.blog.dao.BoardDAOImpl;
import org.blog.domain.BoardVO;
import org.junit.jupiter.api.Test;

import lombok.extern.log4j.Log4j;
@Log4j
class BoardDAOTest {

	BoardDAO dao = new BoardDAOImpl();

//	@Test
	void insertTest() {
		BoardVO vo = new BoardVO();
		vo.setTitle("제목 테스트");
		vo.setContent("내용 테스트");
		vo.setWriter("테스트 작성자");

		dao.insert(vo);

	}

	//@Test
	void selectTest() {
		log.info(dao.select(2562L));
	}

	@Test
	void getListTest() {
		log.info(dao.getList());
	}
}
