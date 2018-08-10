package com.del.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;


import com.del.mvc.bean.Login;
import com.del.mvc.bean.Player;
import com.del.mvc.bean.Schedule;
//import com.del.util.JPAUtil;

@Repository("cDao")
public class CricDaoImpl implements CricDao{

//	private String login = "deloitte";
//	private String password = "del123";
	
	public CricDaoImpl() {
		System.out.println("cdao constr");
	}

	@Override
	public boolean authenticate(Login login) {
		// TODO Auto-generated method stub
		boolean res = false;
		Login check = new Login();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cricketApp");
		EntityManager em = emf.createEntityManager();
		check = em.find(Login.class, login.getLogin());
		em.close();
		if((check!=null) && (check.getPassword().equals(login.getPassword())))
			res = true;
		return res;
	}

	@Override
	public boolean register(Login newLogin) {
		// TODO Auto-generated method stub
		boolean res = false;
		try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("cricketApp");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(newLogin);
			em.getTransaction().commit();
			em.close();
			res = true;
			}catch (Exception e) {
				System.out.println("Error");
			}
		return res;
	}

	@Override
	public List<Schedule> getSchedule() {
		// TODO Auto-generated method stub
		List<Schedule> schedule = null;
		String qry = "Select matches from Schedule as matches";
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cricketApp");
		EntityManager em = emf.createEntityManager();
		TypedQuery<Schedule> query = em.createQuery(qry, Schedule.class);//createNamedQuery(qry, Schedule.class);
		schedule = query.getResultList();
		System.out.println(schedule);
		em.close();
		return schedule;
	}

	@Override
	public boolean validateChoice(Schedule newSchedule) {
		// TODO Auto-generated method stub
		boolean res = false;
		Schedule schedule = new Schedule();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cricketApp");
		EntityManager em = emf.createEntityManager();
		schedule = em.find(Schedule.class, newSchedule.getMatchID());
		em.close();
		if((schedule!=null) && (schedule.getMatchID()==(newSchedule.getMatchID()))) {
			res = true;
		}
		return res;
	}

	@Override
	public String[] getTeams(Schedule newSchedule) {
		// TODO Auto-generated method stub
//		int num = newSchedule.getMatchID();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cricketApp");
		EntityManager em = emf.createEntityManager();
		Schedule fixture = new Schedule();
		fixture = em.find(Schedule.class, newSchedule.getMatchID());
		String team1 = fixture.getTeam1();
		String team2 = fixture.getTeam2();
		String[] ret = {team1,team2};
		return ret;
	}

	@Override
	public List<Player> getPlayers(String team) {
		// TODO Auto-generated method stub
		List<Player> players = null;
		String qry = "select PlayerName from Player where Team ="+team;
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cricketApp");
		EntityManager em = emf.createEntityManager();
		TypedQuery<Player> query = em.createQuery(qry, Player.class);
		return null;
	}



	/*public static void main(String[] args) {
		CricDaoImpl obj = new CricDaoImpl();
		System.out.println(obj.getSchedule());
	}*/
}
