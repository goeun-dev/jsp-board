package org.blog.controller;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BasicController
 */
public class BasicController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// 한글 인코딩 (삭제 예정, 필터 구현 예정)
		res.setContentType("UTF-8");
		req.setCharacterEncoding("UTF-8");

		// 요청받은 URI
		String path = req.getRequestURI();

		System.out.println("PATH: " + path);

		// 요청받은 method
		String methodType = req.getMethod();

		System.out.println("Method: " + methodType);

		// 요청받은 클래스의 전체 메소드 목록과 methodType을 비교
		// 일치하면 targetMethod가 m을 가리킴
		Method[] methods = this.getClass().getDeclaredMethods();
		System.out.println(methods[0]);
		Method targetMethod = null;

		for (int i = 0; i < methods.length; i++) {
			Method m = methods[i];
			RequestMapping anno = m.getDeclaredAnnotation(RequestMapping.class);
			System.out.println("anno : " + anno);

			String annoPath = anno.value();
			System.out.println("annopath : " + annoPath);

			String annoType = anno.type();
			System.out.println("annoType : " + annoType);

			if (path.equals(annoPath) && (annoType.equals(methodType))) {
				targetMethod = m;
				break;
			}

		}

		// targetMethod의 반환값에 따라 이동방식을 결정
		try {

			System.out.println("targetMethod: " + targetMethod);

			String result = (String) targetMethod.invoke(this, req, res);

			System.out.println(result);
			if (result.startsWith("redirect:")) {
				System.out.println(result.substring(10));
				res.sendRedirect(result.substring(10));

			} else {
				req.getRequestDispatcher("/WEB-INF/views" + result + ".jsp").forward(req, res);
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
