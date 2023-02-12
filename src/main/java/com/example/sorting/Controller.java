package com.example.sorting;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

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

  public void sortArray() {
      BubbleSort.sortArray(arr);
      title.setText(arr.toString());

      this.displayRects();
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