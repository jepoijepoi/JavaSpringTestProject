package com.ul.testwebproject.dao;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ul.testwebproject.beans.Actor;

public class ActorDAOImpl implements ActorDAO {

	static Logger log = Logger.getLogger(ActorDAOImpl.class.getName());

	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplateObject;
	
	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObject = jdbcTemplateObject;
	}

	@Override
	public Actor getActorById(int actorId) {
		log.info("into getActorById");
		Actor actor = new Actor();
		String query = "SELECT * FROM actor WHERE actor_id = ?";
		actor = jdbcTemplateObject.queryForObject(query, new Object[] { actorId }, new ActorMapper());			
		return actor;
	}

	@Override
	public void deleteActor(int actorId) {
		log.info("into deleteActor");
		String query = "DELETE FROM actor WHERE actor_id = ?";
		jdbcTemplateObject.update(query, actorId);
		return;
	}

	@Override
	public void insertActor(Actor actor) {
		log.info("into insertActor");
		String query = "INSERT INTO actor (first_name, last_name) values (?, ?)";
		jdbcTemplateObject.update(query, actor.getFirstName(), actor.getLastName());
		return;
	}

	@Override
	public void updateActor(Actor actor) {
		log.info("into updateActor");
		String query = "UPDATE actor SET first_name = ?, last_name = ? WHERE actor_id = ?";
		jdbcTemplateObject.update(query, actor.getFirstName(), actor.getLastName(), actor.getActorId());
		return;
	}

	@Override
	public List<Actor> getActors() {
		log.info("into getActors");
		String query = "SELECT * FROM actor";
		List<Actor> actorList = jdbcTemplateObject.query(query, new ActorMapper());
		return actorList;
	}

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
