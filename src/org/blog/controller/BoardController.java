package org.blog.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.blog.dao.BoardDAO;
import org.blog.dao.BoardDAOImpl;
import org.blog.domain.BoardVO;
import org.blog.dto.PageMaker;
import org.blog.dto.PagingDTO;

import lombok.extern.log4j.Log4j;

/**
 * Servlet implementation class BoardController
 */
@Log4j
@WebServlet("/board/*")
public class BoardController extends BasicController {
	private static final long serialVersionUID = 1L;

	private BoardDAO dao;

	// dao 인스턴스 생성
	public BoardController() {
		dao = new BoardDAOImpl();
	}

	// 리스트 조회
	@RequestMapping(value = "/board/list", type = "GET")
	public String list(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// page, amount
		// 파라미터 수집
		String page = req.getParameter("page");
		String amount = req.getParameter("amount");

		// dto 생성
		PagingDTO dto = new PagingDTO(page, amount);
		PageMaker pm = new PageMaker(dao.getCount(), dto);

		// setAttribute
		req.setAttribute("list", dao.getList(dto));
		req.setAttribute("pm", pm);

		log.info("list......................");

		return "/board/list";
	}

	// 조회
	@RequestMapping(value = "/board/read", type = "GET")
	public String read(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// bno, page, amount
		long bno = Long.parseLong(req.getParameter("bno"));
		req.setAttribute("board", dao.select(bno));

		return "/board/read";
	}

	// 등록 폼
	@RequestMapping(value = "/board/register", type = "GET")
	public String addGet(HttpServletRequest req, HttpServletResponse res) throws Exception {
		return "/board/register";
	}

	// 등록
	@RequestMapping(value = "/board/register", type = "POST")
	public String addForm(HttpServletRequest req, HttpServletResponse res) throws Exception {
		return ":redirect/list";
	}

	// 수정 폼
	@RequestMapping(value = "/board/update", type = "GET")
	public String updateForm(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// bno, page, amount
		long bno = Long.parseLong(req.getParameter("bno"));
		req.setAttribute("board", dao.select(bno));

		return "/board/update";
	}

	// 수정
	@RequestMapping(value = "/board/update", type = "POST")
	public String updatePost(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// bno, page, amount
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		Long bno = Long.parseLong(req.getParameter("bno"));
		System.out.println(bno);

		BoardVO vo = new BoardVO();
		vo.setBno(bno);
		vo.setTitle(title);
		vo.setContent(content);

		dao.update(vo);

		return "redirect:/list";
	}

	// 삭제 폼
	@RequestMapping(value = "/board/delete", type = "GET")
	public String deleteForm(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// bno, page, amount

		return "/board/delete";
	}

	// 삭제
	@RequestMapping(value = "/board/delete", type = "POST")
	public String deletePost(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// bno, page, amount
		Long bno = Long.parseLong(req.getParameter("bno"));
		dao.delete(bno);

		return "redirect:/list";
	}

}
