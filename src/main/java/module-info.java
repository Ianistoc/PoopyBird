module org.itoc.flappybird.flappybirdgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.itoc.flappybird.flappybirdgame to javafx.fxml;
    exports org.itoc.flappybird.flappybirdgame;
}