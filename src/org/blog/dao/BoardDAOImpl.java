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
		boolean result = false;

		try (SqlSession session = factory.openSession()) {

			int count = session.update("org.blog.dao.BoardMapper.update", vo);
			result = count == 1 ? true : false;

			session.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean delete(Long bno) {
		boolean result = false;

		try (SqlSession session = factory.openSession()) {

			int count = session.delete("org.blog.dao.BoardMapper.delete", bno);
			result = count == 1 ? true : false;

			session.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
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
		List<BoardVO> result = null;

		try (SqlSession session = factory.openSession()) {

			result = session.selectList("org.blog.dao.BoardMapper.getList");

		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

}
