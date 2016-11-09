package tr.edu.anadolu.admin.servlets;

import tr.edu.anadolu.admin.dao.NewsDAO;
import tr.edu.anadolu.admin.models.News;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Can Canbay on 23.6.2016.
 */
@WebServlet("admin/delete-news")
public class DeleteNewsServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        NewsDAO mynewDAO = new NewsDAO();
        int newsid = Integer.parseInt(request.getParameter("id"));
        try {
            mynewDAO.deleteNews(newsid);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        request.setAttribute("id",request.getParameter("id"));
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/DeleteNews.jsp");
        requestDispatcher.forward(request, response);



    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.sendRedirect("list-news");

    }
}
