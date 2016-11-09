package tr.edu.anadolu.user.servletsUser;
import tr.edu.anadolu.admin.dao.NewsDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("show-news")
public class ShowNewsServlet extends HttpServlet {

    public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException {
        String id = request.getParameter("id");
        int idint = Integer.parseInt(id);
        NewsDAO dao = new NewsDAO();
        try {
            request.setAttribute("shownews",dao.getStudentById(idint));
        } catch (Exception e) {
            e.printStackTrace();
        }
        RequestDispatcher view = request.getRequestDispatcher("/ShowNews.jsp");
        view.forward(request, response);
    }

    public void doPost(HttpServletRequest request , HttpServletResponse response) throws  ServletException,IOException{

    }

}
