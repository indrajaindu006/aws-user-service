package com.ibm;

public class ToDo {

	private String id;
	private String desc;
	private boolean isCompleted;

	public ToDo() {
		super();
	}

	public ToDo(String id, String desc, boolean isCompleted) {
		super();
		this.id = id;
		this.desc = desc;
		this.isCompleted = isCompleted;
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

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	@Override
	public String toString() {
		return "ToDo [id=" + id + ", desc=" + desc + ", isCompleted=" + isCompleted + "]";
	}

}
