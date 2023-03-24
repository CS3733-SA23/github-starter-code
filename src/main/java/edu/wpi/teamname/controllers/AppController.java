package edu.wpi.teamname.controllers;

import static edu.wpi.teamname.navigation.Screen.PAGE;

import edu.wpi.teamname.navigation.Navigation;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.fxml.FXML;

public class AppController {

  @FXML MFXButton buttonHello;

  @FXML
  private void initialize() {}

  public void navigate() {
    System.out.print("Navigate");
    Navigation.navigate(PAGE);
  }
}
