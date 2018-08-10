package com.del.project.client;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.del.project.bean.Match;
import com.del.project.service.MatchService;

@ComponentScan("com.del.project")
@EnableAutoConfiguration
public class MatchClient {
private static MatchService mService;

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "prod");
		System.out.println("start app");
		ApplicationContext ctx=SpringApplication.run(MatchClient.class);
		System.out.println("gettimg service bean");
		try {
		mService=(MatchService) ctx.getBean("service");
		
		List<Match> matchList=mService.getAllMatchRecords();
		List<Match> matchList2=mService.getAllPlayerRecords();
		List<Match> matchList3=mService.getAllPlayerStats();
		List<Match> matchList4=mService.getAllTeamDetails();
		
		System.out.println(matchList);
		System.out.println(matchList2);
		System.out.println(matchList3);
		System.out.println(matchList4);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("yolo");
		}
	}

}
