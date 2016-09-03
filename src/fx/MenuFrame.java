package fx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import rsc.Values;

/**
 * Created by james on 7/21/2016.
 */
public class MenuFrame extends Application {

    static MainMenuUI menuUI = new MainMenuUI();

    public static void run(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage main = primaryStage;
        main.setFullScreen(true);
        main.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        main.setScene(createScene());
        main.show();
    }

    private static Scene createScene() {
        AnchorPane basePane = menuUI.menuPane();
        return new Scene(basePane);
    }

}
