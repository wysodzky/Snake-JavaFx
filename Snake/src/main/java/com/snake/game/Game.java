package com.snake.game;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Game {

	public static int randXY(int value) {

		return (int) (Math.random() * (value - SnakeConfiguration.getBlockSize())) / SnakeConfiguration.getBlockSize()
				* SnakeConfiguration.getBlockSize();

	}

	public static Rectangle newFood() {
		Rectangle food = new Rectangle(SnakeConfiguration.getBlockSize(), SnakeConfiguration.getBlockSize());
		food.getStyleClass().add("food");

		food = setFood(food);

		return food;
	}

	public static Rectangle grow(double tailX, double tailY) {

		Rectangle rect = new Rectangle(SnakeConfiguration.getBlockSize(), SnakeConfiguration.getBlockSize());
		rect.setFill(Color.FORESTGREEN);
		rect.setTranslateX(tailX);
		rect.setTranslateY(tailY);

		return rect;
	}

	public static boolean checkConditions(Node tail, Rectangle food) {
		boolean flag = false;

		if (tail.getTranslateX() == food.getTranslateX() && tail.getTranslateY() == food.getTranslateY())
			flag = true;

		return flag;
	}

	public static Rectangle setFood(Rectangle food) {

		food.setTranslateX((int) (Math.random() * (SnakeConfiguration.getWidth() - SnakeConfiguration.getBlockSize()))
				/ SnakeConfiguration.getBlockSize() * SnakeConfiguration.getBlockSize());
		food.setTranslateY((int) (Math.random() * (SnakeConfiguration.getHeight() - SnakeConfiguration.getBlockSize()))
				/ SnakeConfiguration.getBlockSize() * SnakeConfiguration.getBlockSize());

		return food;
	}

	public static void tailConditions(Node tail) {

		if (tail.getTranslateX() < 0) {
			tail.setTranslateX(SnakeConfiguration.getWidth() - SnakeConfiguration.getBlockSize());
		}

		if (tail.getTranslateX() >= SnakeConfiguration.getWidth()) {
			tail.setTranslateX(0.0);
		}

		if (tail.getTranslateY() < 0) {
			tail.setTranslateY(SnakeConfiguration.getHeight() - SnakeConfiguration.getBlockSize());

		}
		if (tail.getTranslateY() >= SnakeConfiguration.getHeight()) {
			tail.setTranslateY(0.0);
		}

	}

}
