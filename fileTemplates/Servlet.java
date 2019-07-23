#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
@WebServlet(name = "${Class_Name}Servlet", urlPatterns = "/${Class_Name}Servlet")
public class ${Class_Name}Servlet extends BaseServlet {
 
    

    private void writerDate(HttpServletResponse res, String json) {
        try (PrintWriter writer = res.getWriter()) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



















