package com.example.sorting;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Controller implements Initializable {

  @FXML
  Label title;

  @FXML
  Label sorted;

  @FXML
  Pane arrPane;

  @FXML
  TextField arrSize;

  @FXML
  Button generate;

  ArrayList<Rectangle> rects = new ArrayList<Rectangle>();

  private int max;
  ArrayList<Integer> arr;

  public void onClick() {

    arr = CreateArray.createArray(max, 100);
    title.setText(arr.toString());
    this.displayRects();

  }

  private void displayRects() {
    double width = arrPane.getWidth();
    double rectWidth = (width - (2 * max)) / max;

    arrPane.getChildren().clear();
    double x = 2;
    int y = 0;


    for (int i = 0; i < arr.size(); i++) {
      Rectangle rectangle = new Rectangle(rectWidth, arr.get(i), Color.HOTPINK);
      rectangle.setX(x);
      rectangle.setY(arrPane.getHeight() - arr.get(i));

      rects.add(rectangle);
      x += rectWidth + 2;
      arrPane.getChildren().add(rectangle);
    }
  }

  // Sorting Animation below -> may not use because have to do
  // both compare & swap and entire algorithm here.

//  public void sortArray() {
//    int currentIndex = 0;
//    AnimationTimer animationTimer = new AnimationTimer() {
//      @Override
//      public void handle(long now) {
//        if (currentIndex < arr.size() - 1) {
//          int compare = arr.get(currentIndex).compareTo(arr.get(currentIndex + 1));
//          if (compare > 0) {
//            Collections.swap(arr, currentIndex, currentIndex + 1);
//            displayRects();
//            currentIndex = 0;
//          } else {
//            currentIndex++;
//          }
//        } else {
//          this.stop();
//        }
//      }
//    };
//    animationTimer.start();
//  }

  public void sortArray() {
    BubbleSort.sortArray(arr);
    title.setText(arr.toString());
    displayRects();
  }

  public void inputEnter(){
    max = Integer.parseInt(arrSize.getText());
      generate.setDisable(false);
  }

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle) {
    generate.setDisable(true);
  }
}