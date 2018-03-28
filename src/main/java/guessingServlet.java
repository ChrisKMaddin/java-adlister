import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "guessingServlet", urlPatterns = "guessingGame")
public class guessingServlet extends HttpServlet {
    private int computerNumber = (int) Math.floor(Math.random() * 100) + 1;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String guessString = request.getParameter("guess");
        int guess = Integer.parseInt(guessString);

        //Check if it is the nummber
        if(guess == computerNumber) {
            request.setAttribute("answer", "You guessed It");
        }else if(guess < computerNumber){
            request.setAttribute("answer","Higher");
        }else if(guess > computerNumber){
            request.setAttribute("answer", "lower");
        }

        request.getRequestDispatcher("guess-Answer.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("hi-low.jsp").forward(request, response);
    }
}
