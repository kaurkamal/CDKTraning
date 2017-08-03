import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RandomNumberServlet extends javax.servlet.http.HttpServlet {


    public void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter p = response.getWriter();
        response.setContentType("text/html");
        DateFormat date1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        p.write("</br> Date and time : " + date1.format(date));
        p.write("</br> Ramdom number is : " + Math.random());

    }
}
