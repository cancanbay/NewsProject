package tr.edu.anadolu.user.servletsUser;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {

    public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException,IOException {
        RequestDispatcher view = request.getRequestDispatcher("/index.jsp");
        view.forward(request, response);
    }

    public void doPost(HttpServletRequest request , HttpServletResponse response) throws  ServletException,IOException{

    }
}
