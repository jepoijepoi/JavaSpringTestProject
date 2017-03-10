package com.ul.testwebproject.dao;

import java.util.List;

import com.ul.testwebproject.beans.Actor;

public interface ActorDAO {

    public Actor getActorById(int actorId);	
    
    public void deleteActor(int actorId);
    
    public void insertActor(Actor actor);
    
    public void updateActor(Actor actor);
    
    public List<Actor> getActors();
    
}
