
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Login extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name=request.getParameter("name");
        String password=request.getParameter("pass");
        PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            if(name.equals("amna") && password.equals("amna")){
                out.println("<h1>Login  Successfully " + name + "</h1>");
            }else{
                out.println("<h1> Incorrect username and password</h1>");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }
