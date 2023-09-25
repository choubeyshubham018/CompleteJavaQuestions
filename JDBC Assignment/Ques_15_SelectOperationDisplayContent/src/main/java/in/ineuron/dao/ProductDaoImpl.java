package in.ineuron.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.ineuron.model.Product;
import in.ineuron.util.JdbcUtil;

public class ProductDaoImpl implements IProductDao {

	private Connection connection;

	@Override
	public Product getProduct(Integer pid) {
		String selectQuery="Select pid,pname,price,qty from product1 where pid=?";
		connection = JdbcUtil.getConnection();
		Product prod=null;
		if(connection!=null) {
			try {
				PreparedStatement pst = connection.prepareStatement(selectQuery);
			    if(pst!=null) {
			    	pst.setInt(1, 1);
			    	ResultSet resultSet = pst.executeQuery();
			    	if(resultSet.next()) {
			    		prod=new Product();
			    		prod.setPid(resultSet.getInt(1));
			    		prod.setPname(resultSet.getString(2));
			    		prod.setPrice(resultSet.getInt(3));
			    		prod.setQty(resultSet.getInt(4));
			    		
			    	}
			    }
			} catch (SQLException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return prod;
	}

}
