package com.ibm;

public class ToDo {

	private String id;
	private String desc;
	private Integer priority;

	public ToDo() {
		super();
	}

	public ToDo(String id, String desc, Integer priority) {
		super();
		this.id = id;
		this.desc = desc;
		this.priority = priority;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", desc=" + desc + ", priority=" + priority + "]";
	}

}
