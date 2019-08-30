package io.github.isotes.fadd.webapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class FaddServletTest {
	@Mock private HttpServletRequest request;
	@Mock private HttpServletResponse response;
	@Mock private RequestDispatcher requestDispatcher;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void doGet() throws ServletException, IOException {
		when(request.getParameter("na")).thenReturn("1");
		when(request.getParameter("da")).thenReturn("2");
		when(request.getParameter("nb")).thenReturn("1");
		when(request.getParameter("db")).thenReturn("4");
		when(request.getRequestDispatcher("result.jsp")).thenReturn(requestDispatcher);

		new FaddServlet().doGet(request, response);

		verify(request).setAttribute("result", "3 / 4");
		verify(requestDispatcher).forward(request,response);
	}
}
