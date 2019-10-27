package org.blog.dao;

import java.util.List;

import org.blog.domain.BoardVO;

public interface BoardDAO {

	// 등록 수정 삭제 조회 추상 메서드 선언

	public boolean insert();

	public boolean update();

	public boolean delete();

	public BoardVO select();

	public List<BoardVO> getList();

}
