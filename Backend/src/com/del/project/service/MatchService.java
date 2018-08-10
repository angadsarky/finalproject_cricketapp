package com.del.project.service;

import java.util.List;

import com.del.project.bean.Match;

public interface MatchService {
List<Match> getAllMatchRecords();

List<Match> getAllPlayerRecords();

List<Match> getAllPlayerStats();

List<Match> getAllTeamDetails();

}
