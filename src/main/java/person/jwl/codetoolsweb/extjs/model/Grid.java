package person.jwl.codetoolsweb.extjs.model;

import java.util.List;

import person.jwl.codetoolsweb.model.ConstInfo;

public class Grid<T> {

	private List<T> items;

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}
	
}
