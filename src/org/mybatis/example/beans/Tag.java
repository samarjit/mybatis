package org.mybatis.example.beans;

public class Tag {
	public int id;
	public String value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "\n\t\t\tTag [id=" + id + ", value=" + value + "]";
	}

}
