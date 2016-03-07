package com.thomas.njsvrs;

public class Basic {
	private int height;
	private String type;

	Basic(String type) {
		this.type = type;
	}

	Basic(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
