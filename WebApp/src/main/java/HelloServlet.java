import org.json.simple.JSONObject;
import org.json.simple.JSONStreamAware;
import utils.JSON;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        JSONObject resultJson = new JSONObject();
        resultJson.put("name",req);
        PrintWriter pw = resp.getWriter();
        pw.println("<H1>Hello, world! или Привет мир</H1>");
    }
@Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setContentType("text/plain; charset=UTF-8");
    resp.setHeader("Cache-Control", "no-cache, no-store, must-revalidate, private");
    resp.setHeader("Pragma", "no-cache");
    resp.setHeader("Access-Control-Allow-Origin", "*");
    resp.setDateHeader("Expires", 0);

    Map staff = new HashMap();
    staff.put("login",req.getParameter("log"));
    staff.put("pass",req.getParameter("pass"));
    JSONObject resultJson = new JSONObject();
    resultJson.put("login",req);
    resultJson.put("login",req);
    PrintWriter pw = resp.getWriter();
    pw.println("<H1>Hello, world! или Привет мир</H1>");
   }
}
