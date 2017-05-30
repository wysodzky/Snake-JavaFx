package com.snake.game;

import javafx.scene.shape.Rectangle;

public class SnakeConfiguration {

	private static final int BLOCK_SIZE = 20;
	private static final int WIDTH = 20 * BLOCK_SIZE;
	private static final int HEIGHT = 15 * BLOCK_SIZE;
	
	static Rectangle food;

	private static double tailX;
	private static double tailY;
	

	public static void setTail(double x, double y) {
		tailX = x;
		tailY = y;
	}

	public static double getTailX() {
		return tailX;
	}

	public static double getTailY() {

		return tailY;
	}

	public static Rectangle getFood() {
		return food;
	}

	public static int getBlockSize() {
		return BLOCK_SIZE;
	}

	public static int getHeight() {
		return HEIGHT;
	}

	public static int getWidth() {

		return WIDTH;
	}
}
