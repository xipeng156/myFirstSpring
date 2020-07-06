import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
    public static void main(String[] args) throws IOException {
        System.out.println("jdbcutils");


        Properties properties = new Properties();
        InputStream inputStream = JdbcUtils.class.getClassLoader().getResourceAsStream("Jdbc.properties");
        properties.load(inputStream);

        System.out.println(properties.getProperty("jdbc.driver"));

        try {
            new com.mysql.cj.jdbc.Driver();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
