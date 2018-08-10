package com.del.project.Dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.del.project.bean.Match;

@Repository("mDao")
public class MatchDaoImpl extends JdbcDaoSupport implements MatchDao {
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private DataSource dataSource;
	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
		jdbcTemplate=getJdbcTemplate();
	}
	
	
	public MatchDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public List<Match> getAllMatchRecords() {
		String sql="SELECT matchID,team1,team2,date,location FROM Match";
		List<Match> mList=jdbcTemplate.query(sql, new MatchRowMapper());
		return mList;
		
	}


	@Override
	public List<Match> getAllPlayerRecords() {
		String sql="SELECT PlayerID,PlayerName,Team,TeamID FROM player";
		List<Match> mList=jdbcTemplate.query(sql, new MatchRowMapper());
		return mList;
	}


	@Override
	public List<Match> getAllPlayerStats() {
		String sql="SELECT PlayerID,Matches,Runs,Wickets FROM stats";
		List<Match> mList=jdbcTemplate.query(sql, new MatchRowMapper());
		return mList;
	}


	@Override
	public List<Match> getAllTeamDetails() {
		String sql="SELECT TeamID,TeamName FROM teamdetails";
		List<Match> mList=jdbcTemplate.query(sql, new MatchRowMapper());
		return mList;
	}

}
