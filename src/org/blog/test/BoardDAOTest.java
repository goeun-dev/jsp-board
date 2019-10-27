package org.blog.test;

import org.blog.dao.BoardDAO;
import org.blog.dao.BoardDAOImpl;
import org.blog.domain.BoardVO;
import org.junit.jupiter.api.Test;

class BoardDAOTest {

	BoardDAO dao = new BoardDAOImpl();

	@Test
	void insertTest() {
		BoardVO vo = new BoardVO();
		vo.setTitle("제목 테스트");
		vo.setContent("내용 테스트");
		vo.setWriter("테스트 작성자");

		dao.insert(vo);

	}

}
