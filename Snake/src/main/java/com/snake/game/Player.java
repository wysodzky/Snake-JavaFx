package com.snake.game;

import java.io.Serializable;

public class Player implements Serializable {
	private String name;
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int getScore() {

		return score;
	}
	public void setScore() {
		this.score = score;
	}
	
	public Player(String name, int score) {

		this.name = name;
		this.score = score;
	}
}
