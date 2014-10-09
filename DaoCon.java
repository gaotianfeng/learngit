package action;
import java.sql.*;
/**
 * 返回connection
 * @author Administrator
 *
 */
public class DaoCon {
	public Connection GetConn() throws Exception{
		//数据库的驱动
		Class.forName("com.mysql.jdbc.Driver");
		//设置编码和URL地址还有用户名和密码
		String url = "jdbc:mysql://localhost:3306/bookdb?characterEncodeing="+"utf-8";
		String user = "root";
		String password = "gtf112560";
		//建立数据库的连接
		Connection con = DriverManager.getConnection(url, user, password);
		//返回数据库的连接
		return con;
	}
}
