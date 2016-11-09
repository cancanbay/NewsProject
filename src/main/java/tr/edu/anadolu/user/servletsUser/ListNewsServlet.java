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

@WebServlet("/list-news")
public class ListNewsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException {
        String category = request.getParameter("category");
        try {

            if (category == null) {
//                NewsDAO newsDAO = new NewsDAO();
//                request.setAttribute("haberler", newsDAO.listNews());
                RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
                view.forward(request, response);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        int count =0;
        request.setAttribute("count",count);

        if (category != null) {
            if (category.equalsIgnoreCase("magazin")) {

                try {
                    NewsDAO dao = new NewsDAO();
                    request.setAttribute("newsquery", dao.listNewsQuery("= 'Magazin'"));
                    RequestDispatcher view = request.getRequestDispatcher("/UserListNews.jsp");
                    view.forward(request, response);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
           else if (category.equalsIgnoreCase("spor")) {

                try {
                    NewsDAO dao = new NewsDAO();
                    request.setAttribute("newsquery", dao.listNewsQuery("= 'Spor'"));
                    RequestDispatcher view = request.getRequestDispatcher("/UserListNews.jsp");
                    view.forward(request, response);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
           else if (category.equalsIgnoreCase("saglik")) {

                try {
                    NewsDAO dao = new NewsDAO();
                    request.setAttribute("newsquery", dao.listNewsQuery("= 'Saglik'"));
                    RequestDispatcher view = request.getRequestDispatcher("/UserListNews.jsp");
                    view.forward(request, response);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
           else if (category.equalsIgnoreCase("moda")) {

                try {
                    NewsDAO dao = new NewsDAO();
                    request.setAttribute("newsquery", dao.listNewsQuery("= 'Moda'"));
                    RequestDispatcher view = request.getRequestDispatcher("/UserListNews.jsp");
                    view.forward(request, response);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
           else if (category.equalsIgnoreCase("gundem")) {

                try {
                    NewsDAO dao = new NewsDAO();
                    request.setAttribute("newsquery", dao.listNewsQuery("= 'Gundem'"));
                    RequestDispatcher view = request.getRequestDispatcher("/UserListNews.jsp");
                    view.forward(request, response);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
           else if (category.equalsIgnoreCase("yasam")) {

                try {
                    NewsDAO dao = new NewsDAO();
                    request.setAttribute("newsquery", dao.listNewsQuery("= 'Yasam'"));
                    RequestDispatcher view = request.getRequestDispatcher("/UserListNews.jsp");
                    view.forward(request, response);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else {
                try {
                    NewsDAO dao = new NewsDAO();
                    request.setAttribute("newsquery", dao.listNewsQuery("= 'Ekonomi'"));
                    RequestDispatcher view = request.getRequestDispatcher("/UserListNews.jsp");
                    view.forward(request, response);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException{


    }
}
