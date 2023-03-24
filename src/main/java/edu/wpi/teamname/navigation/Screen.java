package edu.wpi.teamname.navigation;

public enum Screen {
  PAGE("views/Page.fxml"),
  APP("views/App.fxml");

  private final String filename;

  Screen(String filename) {
    this.filename = filename;
  }

  public String getFilename() {
    return filename;
  }
}
