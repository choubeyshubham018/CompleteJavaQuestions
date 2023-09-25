package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.util.JdbcUtil;

public class SelectOperation {

	private Connection connection;
	private PreparedStatement pst;

	public void selectOperation(Integer id)  {
		String selectQuery="Select empid,empname,empaddr,empsal,empage,desg from employee where empid=?" ;
		connection = JdbcUtil.getConnection();
		if(connection!=null) {
			
			try {
				pst = connection.prepareStatement(selectQuery);
		
				if(pst!=null) {
					pst.setInt(1, id);
				ResultSet res = pst.executeQuery();
				System.out.println(res);
				if(res!=null) {
					if(res.next()) {
				System.out.println("Id -> "+res.getInt(1));
				System.out.println("Name -> "+res.getString(2));
				System.out.println("Address -> "+res.getString(3));
				System.out.println("Salary -> "+res.getInt(4));
				System.out.println("Age -> "+res.getInt(5));
				System.out.println("Designation -> "+res.getString(6));
					}
				}
				}} catch (SQLException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
		}
	}
}
