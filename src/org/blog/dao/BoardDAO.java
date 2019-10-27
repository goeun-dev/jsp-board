package org.blog.dao;

import java.util.List;

import org.blog.domain.BoardVO;

public interface BoardDAO {

	// 등록 수정 삭제 조회 추상 메서드 선언

	public boolean insert(BoardVO vo);

	public boolean update(BoardVO vo);

	public boolean delete(long bno);

	public BoardVO select(long bno);

	public List<BoardVO> getList();

}
