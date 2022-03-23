package com.maroun.devoir_ejb;

import com.maroun.statelessBeans.Hello;
import com.maroun.statelessBeans.HelloBean;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/")
public class HelloServlet extends HttpServlet {
    private static Hello h;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        h = new HelloBean();
        out.println("<html><body>");
        out.println("<h1>" + h.sayHello() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}