package controllers;

import models.Task;
import play.*;
import play.mvc.*;
import play.data.*;

import views.html.*;

public class Application extends Controller {

	static Form<Task> taskForm = form(Task.class);

	public static Result index() {
		return redirect(routes.Application.tasks());
	}

	public static Result tasks() {
		return ok(
				views.html.index.render(Task.all(), taskForm)
				);
	}

	public static Result newTask() {
		return TODO;	  
	} 

	public static Result deleteTask(Long id) {
		return TODO;
	}

}