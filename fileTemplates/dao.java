#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME}Dao {
      private static BasicDataSource ds;
    
     static {
        ResourceBundle properties = ResourceBundle.getBundle("${dbconfig}");
        ds = new BasicDataSource();
        ds.setDriverClassName(properties.getString("driver"));
        ds.setUrl(properties.getString("url"));
        ds.setUsername(properties.getString("user"));
        ds.setPassword(properties.getString("pwd"));
    }
    
    private QueryRunner qr = new QueryRunner(ds);
    
    
}



















