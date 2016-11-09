package tr.edu.anadolu.admin.servlets;
import tr.edu.anadolu.admin.dao.DBConnection;
import tr.edu.anadolu.admin.dao.NewsDAO;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/admin/create-news")
public class CreateNewsServlet extends HttpServlet {

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        request.setAttribute("now", dateFormat.format(new Date()));
        RequestDispatcher view = request.getRequestDispatcher("/NewsForm.jsp");
        view.forward(request, response);

    }

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        res.setCharacterEncoding("UTF-8");
        String title = req.getParameter("txtTitle");
        String description = req.getParameter("txtdesc");
        String detail = req.getParameter("txtdetail");
        String imageurl = req.getParameter("txtimg");
        String category= req.getParameter("item");

        NewsDAO newsDAO = new NewsDAO();
        try(Connection connection = DBConnection.getConnection()) {
            newsDAO.insertNews(title, description, detail,category, imageurl);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
          catch(ClassNotFoundException cnf){
              cnf.printStackTrace();
          }

        res.sendRedirect("list-news");
    }
}