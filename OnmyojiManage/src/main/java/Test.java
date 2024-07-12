
import com.github.pagehelper.util.StringUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
//            Connection connection = DriverManager.getConnection("jdbc:mysql://阿里云域名:端口号/数据库", "用户名", "密码");
            Connection connection = DriverManager.getConnection("jdbc:mysql://rm-bp1799197877460ipio.mysql.rds.aliyuncs.com:3306/onmyoji_database?serverTimezone=UTC", "liukaiwen", "My148632");
            if (StringUtil.isNotEmpty(String.valueOf(connection))) {
                System.out.println("连接成功");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

