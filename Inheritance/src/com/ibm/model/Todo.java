package com.ibm.model;

public class Todo {
		
		private String todoId;
		private String desc;
		private boolean isCompleted;
		
		public Todo() {
			super();
		}
		
		public void createTodo(String desc, boolean isCompleted) {
			this.todoId = "demo-todo";
			this.desc = desc;
			this.isCompleted = isCompleted;
		}
		
		

		public String getTodoId() {
			return todoId;
		}

		public void setTodoId(String todoId) {
			this.todoId = todoId;
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

		public final String getDetails() {
			return "ToDo ID: " + todoId + " Desc: " + desc + " isCompleted? " + isCompleted;
		}
		
		

		/*@Override
		public String toString() {
			return "ToDo ID: " + todoId + " Desc: " + desc + " isCompleted? " + isCompleted;
		}*/

		@Override
		public boolean equals(Object obj) {
			Todo todo = null;
			if (obj instanceof Todo) {
				todo = (Todo) obj;
			}
			if((this.todoId==todo.todoId) &&(this.desc==todo.desc) &&(this.isCompleted==todo.isCompleted))
			{
				return true;
			}
			else
			{
				return false;
			}
		}


	}



