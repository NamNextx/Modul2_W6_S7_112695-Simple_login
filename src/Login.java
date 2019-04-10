import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServerTimeServlet", urlPatterns = "/login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String use = req.getParameter("username");
        String pass = req.getParameter("password");
        PrintWriter writer = resp.getWriter();
        if (use.equals("namtruong") && pass.equals("17611632Pn")){

            writer.println("<html>");
            writer.println("<h1>Hello Nam</h1>");
            writer.println("</html>");
        }
        else {
            writer.println("<html>");
            writer.println("<h1>Cut</h1>");
            writer.println("</html>");
        }


    }
}
