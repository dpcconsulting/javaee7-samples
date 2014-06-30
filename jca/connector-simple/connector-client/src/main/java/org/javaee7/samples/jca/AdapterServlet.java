package org.javaee7.samples.jca;

import org.javaee7.jca.connector.simple.connector.outbound.MyConnection;
import org.javaee7.jca.connector.simple.connector.outbound.MyConnectionFactory;

import javax.annotation.Resource;
import javax.resource.ResourceException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/adapter")
public class AdapterServlet extends HttpServlet {

    @Resource(mappedName = "java:/eis/MyConnection")
    private MyConnectionFactory connectionFactory;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MyConnection connection = null;
        try {
            connection = connectionFactory.getConnection();
            resp.getWriter().write(connection.check());
        } catch (ResourceException e) {
            e.printStackTrace();
        }

    }
}
