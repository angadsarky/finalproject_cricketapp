package com.del.project.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.del.project.bean.Match;

public class MatchRowMapper implements RowMapper<Match> {

	@Override
	public Match mapRow(ResultSet rs, int arg1) throws SQLException {
		System.out.println(arg1);
		return new Match(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
		
	}

	
}
