package com.del.project.Dao;

import java.util.List;

import com.del.project.bean.Match;

public interface MatchDao {

	List<Match> getAllMatchRecords();

	List<Match> getAllPlayerRecords();

	List<Match> getAllPlayerStats();

	List<Match> getAllTeamDetails();

}
