package org.mybatis.converter;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class BoolenAndIntConverter extends BaseTypeHandler<Boolean>{
	//java(boolean)->db(number)
	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType)
			throws SQLException {
		if(parameter) {
			ps.setInt(i, 1);
		}else {
			ps.setInt(i, 0);
		}
		
	}
	//db->java
	@Override
	public Boolean getNullableResult(ResultSet rs, String columnName) throws SQLException {
		int sexnum=rs.getInt(columnName);
		if(sexnum==1)
		return true;
		else
			return false;
	}

	@Override
	public Boolean getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		int sexnum=rs.getInt(columnIndex);
		if(sexnum==1)
		return true;
		else
			return false;
	
	}

	@Override
	public Boolean getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		int sexnum=cs.getInt(columnIndex);
		if(sexnum==1)
		return true;
		else
			return false;
	}

	

}
