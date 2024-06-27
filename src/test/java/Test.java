import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
        //ResourceBundle bundle = ResourceBundle.getBundle("D:\\projects\\idea\\ContactManagerSpring\\src\\main\\resources\\jdbc.properties");
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File("D:\\Project\\JavaProject\\libDemo\\src\\main\\resources\\jdbc.properties")));
            ComboPooledDataSource dataSource = new ComboPooledDataSource();
            dataSource.setDriverClass((String) properties.get("jdbc.driver"));
            dataSource.setJdbcUrl((String) properties.get("jdbc.url"));
            dataSource.setUser((String) properties.get("jdbc.username"));
            dataSource.setPassword((String) properties.get("jdbc.password"));

            Connection connection = dataSource.getConnection();

            System.out.println(connection);

        } catch (PropertyVetoException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
