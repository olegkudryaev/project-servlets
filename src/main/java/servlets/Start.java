package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/start")
public class Start extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String ip = req.getLocalAddr();
        session.setAttribute("id", ip);
        Integer count = (Integer) session.getAttribute("count");
        if (count == null) {
            session.setAttribute("count", 1);
            count = 1;
        } else {
            session.setAttribute("count", count + 1);
        }
        session.getAttribute("ip");
        session.getAttribute("count");
        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        session.setAttribute("firstname", firstname);
        session.setAttribute("lastname", lastname);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/start.jsp");
        requestDispatcher.forward(req, resp);
    }
}
