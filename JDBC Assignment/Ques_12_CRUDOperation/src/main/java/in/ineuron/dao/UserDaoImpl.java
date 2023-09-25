package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.model.User;
import in.ineuron.util.JdbcUtil;

public class UserDaoImpl implements IUserDao {

	private Connection connection;

	@Override
	public String addUser(User user) {
		String res="";
		connection = JdbcUtil.getConnection();
		String insertQuery="Insert into user(id,name,age,address) values(?,?,?,?)";
		if(connection!=null) {
			try {
				PreparedStatement pst = connection.prepareStatement(insertQuery);
				if(pst!=null) {
					pst.setInt(1, user.getId());
					pst.setString(2,user.getName());
					pst.setInt(3, user.getAge());
					pst.setString(4,user.getAddr());
					int affRow = pst.executeUpdate();
					if(affRow>0) {
						res="User Record Saved Succesfully";
					}
					else {
						res="Operation Failed try again after some time";
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return res;
	}


	
	@Override
	public User getUser(Integer id) {
		String selectQuery="Select id,name,age,address from user where id=?";
		connection=JdbcUtil.getConnection();
		User user=new User();
		try {
			PreparedStatement pst = connection.prepareStatement(selectQuery);
		    if(pst!=null) {
		    	pst.setInt(1, id);
		    	ResultSet resultSet = pst.executeQuery();
		    	if(resultSet!=null ){
		    		if(resultSet.next()) {
		    		user.setId(id);
		    		user.setName(resultSet.getString(2));
		    		user.setAge(resultSet.getInt(3));
		    		user.setAddr(resultSet.getString(4));
		    		}
		    	}
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public String updateUser(User user) {
		String res="";
		String updateQuery="update user set name='"+user.getName()+"',age="+user.getAge()+
				",address='"+user.getAddr()+"' where id="+user.getId();
		connection=JdbcUtil.getConnection();
		if(connection!=null) {
			try {
				PreparedStatement pst = connection.prepareStatement(updateQuery);
				int affRow = pst.executeUpdate();
				if(affRow>0) {
					res="Record Updated Successfully";
				}
				else {
					res="Updation Failed try again after some time";
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return res;
	}

	@Override
	public String deleteUser(Integer id) {
		connection=JdbcUtil.getConnection();
		String res="";
		String deleteQuery="delete from user where id=?";
		try {
			PreparedStatement pst = connection.prepareStatement(deleteQuery);
			pst.setInt(1, id);
			int affRow = pst.executeUpdate();
			if(affRow>0) {
				res="Record deleted Successfully";
			}else {
				res="Record deletion failed try again after some time";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

}
