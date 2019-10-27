package org.blog.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.blog.domain.BoardVO;
import org.blog.util.MyBatisLoader;

public class BoardDAOImpl implements BoardDAO {

	private SqlSessionFactory factory = MyBatisLoader.INSTANCE.getFactory();

	@Override
	public boolean insert(BoardVO vo) {
		boolean result = false;

		try (SqlSession session = factory.openSession()) {

			int count = session.insert("org.blog.dao.BoardMapper.insert", vo);
			result = count == 1 ? true : false;

			session.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean update(BoardVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Long bno) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BoardVO select(Long bno) {
		BoardVO result = null;

		try (SqlSession session = factory.openSession()) {

			result = session.selectOne("org.blog.dao.BoardMapper.select", bno);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
