package com.hcci.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.hcci.datavalidation.pojo.Medicine;

public class MedicineDAO implements MedicineDAOImpl
{
	
	  
	   private JdbcTemplate jt;
	/*private DataSource dataSource;*/
	   
	   public void setJdbcTemplate(JdbcTemplate jt){
		   this.jt=jt;
	   }
	  
	   
	/*   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jt = new JdbcTemplate(dataSource);
	   }
*/


	@Override
	public Medicine getMedicineBundleCosts(String medicine_cd) {
		
		System.out.println("In MedicineDAO.getMedicineBundleCosts");
		 String SQL = "select medicine_json from medicine_bndl where medicine_cd='"+medicine_cd+"'";
		 
	     ResultSetExtractor<Medicine> rse=new ResultSetExtractor<Medicine>() {
	    	 Medicine e =null;	 
			@Override
			public Medicine extractData(ResultSet rs) throws SQLException, DataAccessException {
					if(rs.next()){
						
						e = new Medicine();
						
						e.setMedicine_json(rs.getString("medicine_json"));
						
						return e;
					}
				return null;
			}
		}; 
		 return jt.query(SQL, rse);
		
	}


}