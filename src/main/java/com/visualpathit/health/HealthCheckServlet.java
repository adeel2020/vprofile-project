import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/health")
public class HealthCheckServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        // Perform health check logic here
        // You can check the state of your application and return an appropriate response.

        // For example, return a 200 OK response when the application is healthy
        resp.setStatus(HttpServletResponse.SC_OK);
    }
}
