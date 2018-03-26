import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CounterServlet", urlPatterns = "/counter")
public class CounterServlet extends HttpServlet{
    private int count;

public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    count+= 1;
    resp.getWriter().println("The count is: " + count + ".");
}
}