package net.danielwind.effcaching.recipe8.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "itemList")
public final class ItemList {

	@XmlElement(name="item")
	private List<Item> itemList;

	public List<Item> getItems() {
		return itemList;
	}

	public void setItems(List<Item> itemList) {
		this.itemList = itemList;
	}
	
	public void clear() {
		this.itemList.clear();
	}

}
