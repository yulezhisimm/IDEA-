#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
@WebServlet(name = "${Class_Name}", urlPatterns = "/${Class_Name}")
public class ${Class_Name} extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
    }
    
    @Override
    protected void doGet(HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type", "text/html;charset=UTF-8");
    }
}