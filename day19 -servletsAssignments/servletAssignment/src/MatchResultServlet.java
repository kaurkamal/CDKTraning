import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@WebServlet(name = "MatchResultServlet")
public class MatchResultServlet extends HttpServlet {
    MatchInfo matchInfo = null;
    List<MatchInfo> list = new ArrayList<>();

    public void init() {

        list.add(new MatchInfo("India", "England", "20-20", "India won"));
        list.add(new MatchInfo("India", "Pakistan", "20-20", "India won"));
        list.add(new MatchInfo("India", "Australia", "WorldCup", "India won"));
        list.add(new MatchInfo("England", "Pakistan", "WorldCup", "England won"));

    }

    public void destroy() {
        list = null;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String country1 = request.getParameter("Country1");
        String country2 = request.getParameter("Country2");
        PrintWriter p = response.getWriter();
        response.setContentType("text/html");

        Iterator<MatchInfo> it = list.iterator();
        while(it.hasNext()){
            MatchInfo match = (MatchInfo) it.next();
            if(country1.equals(match.getCountryName1())&& country2.equals(match.getCountryName2())){
                p.write(match.toString());
                break;
            }
        }


    }
}
