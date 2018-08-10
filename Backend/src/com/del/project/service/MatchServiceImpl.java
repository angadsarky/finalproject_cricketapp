package com.del.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.del.project.Dao.MatchDao;
import com.del.project.bean.Match;
@Service("service")
public class MatchServiceImpl implements MatchService {
private MatchDao mDao;

	
	public MatchServiceImpl() {
	
}

	public MatchServiceImpl(MatchDao mDao) {
		
		this.mDao = mDao;
	}

	@Override
	public List<Match> getAllMatchRecords() {
		return mDao.getAllMatchRecords();
		
	}

	@Override
	public List<Match> getAllPlayerRecords() {
		return mDao.getAllPlayerRecords();
	}

	@Override
	public List<Match> getAllPlayerStats() {
		return mDao.getAllPlayerStats();
	}

	@Override
	public List<Match> getAllTeamDetails() {
		return mDao.getAllTeamDetails();
	}

}
