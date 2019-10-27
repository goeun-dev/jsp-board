package org.blog.test;

import java.io.Console;

import org.blog.dao.BoardDAO;
import org.blog.dao.BoardDAOImpl;
import org.blog.domain.BoardVO;
import org.blog.dto.PagingDTO;
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

//	@Test
	void getListTest() {
		PagingDTO dto = new PagingDTO("1", "10");
		dao.getList(dto).forEach(board -> log.info(board));
		System.out.println();
	}
//	@Test
	void getListTest2() {
		PagingDTO dto = new PagingDTO("2", "10");
		dao.getList(dto).forEach(board -> log.info(board));
		System.out.println();
	}
//	@Test
	void getListTest3() {
		PagingDTO dto = new PagingDTO("3", "10");
		dao.getList(dto).forEach(board -> log.info(board));
		System.out.println();
	}

//	@Test
	void deleteTest() {
		log.info(dao.delete(2567L));
	}

//	@Test
	void updateTest() {
		BoardVO vo = new BoardVO();
		vo.setBno(2562L);
		vo.setTitle("제목 수정 테스트");
		vo.setContent("내용 수정 테스트");
		log.info(dao.update(vo));
	}
}
