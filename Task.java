package models;

import java.util.*;
import play.data.validation.Constraints.*;

public class Task {
	
	public Long id;
	
	@Required
	public String label;
	
	public static List<Task> all() {
		return new ArrayList<task>();
	}
	
	public static void create(Task task) {
	}
	
	public static void delete(Long id) {
	}
	
}
