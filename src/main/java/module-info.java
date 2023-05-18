module fr.rpggame.rpgjavagame {
    requires javafx.controls;
    requires javafx.fxml;

    opens fr.RpgGame.main to javafx.fxml;
    exports fr.RpgGame.main;
}