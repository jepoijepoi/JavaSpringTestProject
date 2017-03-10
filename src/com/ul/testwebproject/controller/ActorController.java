package com.ul.testwebproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ul.testwebproject.beans.Actor;
import com.ul.testwebproject.dao.ActorDAO;

@Controller
public class ActorController extends BaseController {

	@Autowired
	ActorDAO actorDAO;// will inject dao from xml file
	
	/*
	 * It displays a form to input data, here "command" is a reserved request
	 * attribute which is used to display object data into form
	 */
	@RequestMapping("/insertActorForm")
	public ModelAndView showform() {
		return new ModelAndView("insertActorForm.page", "command", new Actor());
	}

	/* It provides list of actors in model object */
	@RequestMapping("/viewActorList")
	public ModelAndView viewActorList() {
		List<Actor> actorList = actorDAO.getActors();
//		System.out.println("into list");
//		for(Actor actor : actorList) {
//			System.out.println(actor.getFirstName() + " " + actor.getLastName());
//		}
		return new ModelAndView("viewActorList.page", "actorList", actorList);
	}

	/*
	 * It displays object data into form for the given id. The @PathVariable
	 * puts URL data into variable.
	 */
	@RequestMapping(value = "/editActor/{actorId}")
	public ModelAndView editActor(@PathVariable int actorId) {
		Actor actor = actorDAO.getActorById(actorId);
		return new ModelAndView("editActorForm.page", "command", actor);
	}

	/*
	 * It saves object into database. The @ModelAttribute puts request data into
	 * model object. You need to mention RequestMethod.POST method because
	 * default request is GET
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("actor") Actor actor) {
		actorDAO.insertActor(actor);
		return new ModelAndView("redirect:/viewActorList");// will redirect to
														// viewactor request
														// mapping
	}

	/* It updates model object. */
	@RequestMapping(value = "/editSave", method = RequestMethod.POST)
	public ModelAndView editSave(@ModelAttribute("actor") Actor actor) {
		actorDAO.updateActor(actor);
		return new ModelAndView("redirect:/viewActorList");
	}

	/* It deletes record for the given id in URL and redirects to /viewactor */
	@RequestMapping(value = "/deleteActor/{actorId}", method = RequestMethod.GET)
	public ModelAndView deleteActor(@PathVariable int actorId) {
		actorDAO.deleteActor(actorId);
		return new ModelAndView("redirect:/viewActorList");
	}

}
