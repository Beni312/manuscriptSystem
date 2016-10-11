package manuscript.module.academic.disciplines.beans;

import java.util.List;

public class ParentNode {

	private String id;
	private String name;
	private List<Nodes> node;

	public ParentNode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParentNode(String id, String name, List<Nodes> node) {
		super();
		this.id = id;
		this.name = name;
		this.node = node;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Nodes> getNode() {
		return node;
	}

	public void setNode(List<Nodes> node) {
		this.node = node;
	}

}
