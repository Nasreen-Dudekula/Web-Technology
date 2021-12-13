import oracle.jdbc.driver.*;
import java.sql.*;
class SimpleDBdemo
{
	public static void main(String args[]) throws SQLException
	{
		OracleDriver od=new OracleDriver();
		DriverManager.registerDriver(od);
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe","system","lbrce");
		System.out.println("DB connection success");
		Statement st=con.createStatement();
		String sql="create table cseb(sid number,sname varchar2(50))";
		st.execute(sql);
		System.out.println("Table created");
	}
}

