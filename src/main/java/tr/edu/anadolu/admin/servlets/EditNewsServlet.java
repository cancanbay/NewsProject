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

@WebServlet("/admin/edit-news")
public class EditNewsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        NewsDAO news = new NewsDAO();
        String i = request.getParameter("id");
        int id = Integer.parseInt(i);
        request.setAttribute("idstring",i);
        try {
            request.setAttribute("edithaber",news.getStudentById(id));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/EditNewsForm.jsp");
        requestDispatcher.forward(request, response);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setCharacterEncoding("UTF-8");
        NewsDAO newsDAO = new NewsDAO();
        News news = new News();
        news.setTitle(req.getParameter("txtTitle"));
        news.setDescription(req.getParameter("txtdesc"));
        news.setDetail(req.getParameter("txtdetail"));
        news.setCategory(req.getParameter("item"));
        news.setImage(req.getParameter("txtimg"));
        String i = req.getParameter("id");
        int id = Integer.parseInt(i);
        news.setId(id);
        try {
            newsDAO.editNews(news);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        res.sendRedirect("list-news");


    }
}
