package io.github.isotes.fadd.webapp;

import io.github.isotes.fadd.library.FMath;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FaddServlet", urlPatterns = {"/result"}, loadOnStartup = 1)
public class FaddServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int na = Integer.parseInt(request.getParameter("na"));
		int da = Integer.parseInt(request.getParameter("da"));
		int nb = Integer.parseInt(request.getParameter("nb"));
		int db = Integer.parseInt(request.getParameter("db"));
		request.setAttribute("result", FMath.add(na, da, nb, db).toString());
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}
}
