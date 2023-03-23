package edu.wpi.teamname.controllers;

import edu.wpi.teamname.navigation.Navigation;
import edu.wpi.teamname.navigation.Screen;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AppController {

  @FXML private MFXButton button;

  @FXML
  private void initialize() {}

  public void navigate(ActionEvent actionEvent) {
    Navigation.navigate(Screen.PAGE);
  }
}
