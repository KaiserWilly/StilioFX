package fx;

import javafx.beans.binding.Bindings;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import rsc.Values;

/**
 * Created by james on 7/21/2016.
 */
public class MainMenuUI {

    AnchorPane menuPane() {
        AnchorPane base = new AnchorPane();
        base.setMinSize(1366.0, 768.0);

        VBox header = new VBox();
        header.setFillWidth(true);



        Label logo = new Label();
        logo.setGraphic(new ImageView(new Image(MainMenuUI.class.getClassLoader().getResourceAsStream("rsc/StilioLogo-01.png"))));
        AnchorPane.setTopAnchor(logo, 30.0);
        base.getChildren().add(logo);


        return base;
    }
}
