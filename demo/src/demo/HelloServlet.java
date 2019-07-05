package demo;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 最简单的Servlet
 * @author Winter Lau
 */
public class HelloServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		Map pMap = req.getParameterMap();

		for (Object key : pMap.keySet()) {
 
			System.out.println("Key = " + key);
			String[] value = (String[]) pMap.get(key);
			System.out.println("Value = " + value[0]);
		}


		res.getWriter().println("Hello World!");
	}

}
