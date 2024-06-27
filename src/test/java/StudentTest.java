import com.iflytek.domain.Student;
import com.iflytek.utilS.JdbcUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class StudentTest {
    public static void main(String[] args) {
        Student student=new Student();
        student.setId(123);
        student.setMobile("12345678910");
        student.setName("tb");
        student.setGender(1);
        student.setAge(18);
        System.out.println(student);
    }


    @Test
    public void testJdbcUtils() throws Exception {
        String sql="SELECT * FROM tb_student;";
        Connection conn = JdbcUtils.getconnection();
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet resultSet = pstm.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String mobile = resultSet.getString("mobile");
            String password = resultSet.getString("password");
            String name = resultSet.getString("name");

            System.out.println("id"+id
                    +",mobile="+mobile
                    +",password"+password
                    +",name"+name
            );
        }
        JdbcUtils.release(null,pstm,conn);


    }
}


