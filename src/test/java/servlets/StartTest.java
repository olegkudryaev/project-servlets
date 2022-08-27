package servlets;

import org.junit.Test;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static org.mockito.Mockito.*;


public class StartTest {

    private static final String path = "views/start.jsp";

    @Test
    public void whenCallDoGetThenServletReturnStartPage() throws ServletException, IOException {
        final Start start = new Start();

        final HttpServletRequest request = mock(HttpServletRequest.class);
        final HttpServletResponse response = mock(HttpServletResponse.class);
        final RequestDispatcher dispatcher = mock(RequestDispatcher.class);
        final HttpSession session = mock(HttpSession.class);

        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher(path)).thenReturn(dispatcher);

        start.doGet(request, response);

        verify(request, times(1)).getRequestDispatcher(path);

        verify(dispatcher).forward(request, response);

    }
}
