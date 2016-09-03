package fx;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * Created by james on 7/21/2016.
 */
public class MainMenuUI {
    private Font cloud18 = Font.loadFont(MainMenuUI.class.getClassLoader().getResourceAsStream("rsc/Cloud-Bold.otf"), 36);

    AnchorPane menuPane() {
        AnchorPane base = new AnchorPane();
        base.setMinSize(1366.0, 768.0);

        VBox footer = new VBox();
        footer.setPrefWidth(java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth());
        footer.setPadding(new Insets(0, 10, 10, 10));
        footer.setAlignment(Pos.BOTTOM_LEFT);
        AnchorPane.setBottomAnchor(footer, 0.0);


        ImageView footerLogo = new ImageView(new Image(MainMenuUI.class.getClassLoader().getResourceAsStream("rsc/StilioDraft1.png")));
        footerLogo.setPreserveRatio(true);
        footerLogo.setFitHeight(250);
        footerLogo.setFitWidth(500);
        Label logo = new Label();
        logo.setGraphic(footerLogo);
        footer.getChildren().add(logo);
        base.getChildren().add(footer);


        ImageView background = new ImageView(new Image(MainMenuUI.class.getClassLoader().getResourceAsStream("rsc/menu/menubackground.png")));
        background.setPreserveRatio(true);
        background.setFitWidth(900);
        Label backgroundL = new Label();
        backgroundL.setGraphic(background);
        AnchorPane.setRightAnchor(backgroundL, 0.0);
        AnchorPane.setBottomAnchor(backgroundL, -5.0);
        base.getChildren().add(backgroundL);

//
//        ImageView trophy = new ImageView(new Image(MainMenuUI.class.getClassLoader().getResourceAsStream("rsc/Trophy_Raw.png")));
//        trophy.setPreserveRatio(true);
//        trophy.setFitWidth(1280);
//        trophy.setFitHeight(720);
//        Label trophyL = new Label();
//        trophyL.setGraphic(trophy);
//        AnchorPane.setBottomAnchor(trophyL, 0.0);
//        AnchorPane.setRightAnchor(trophyL, -100.0);
//        base.getChildren().add(trophyL);

        VBox buttonMenu = new VBox();
        for (int i = 0; i < 6; i++) {
            buttonMenu.getChildren().add(newMenuButton(i));
        }
        buttonMenu.setPadding(new Insets(0, 0, 0, 10));
        AnchorPane.setBottomAnchor(buttonMenu, 250.0);
        AnchorPane.setLeftAnchor(buttonMenu, 0.0);
        base.getChildren().add(buttonMenu);


        return base;
    }

    private Button newMenuButton(int index) {
        Button but = new Button();
        DropShadow ds = new DropShadow(3.0, 3.0, 3.0, Color.BLACK);
        String imageLocation = "rsc/menu/menuButt/menubutton";

        String[] menuTitle = new String[]{
                "play",
                "host",
                "profile",
                "settings",
                "help",
                "credits"
        };
        try {
            ImageView buttonLogo = new ImageView(new Image(MainMenuUI.class.getClassLoader().getResourceAsStream(imageLocation + menuTitle[index] + ".png")));
            buttonLogo.setPreserveRatio(true);
            buttonLogo.setFitWidth(400);
            buttonLogo.setSmooth(false);
            ImageView buttonLogoHover = new ImageView(new Image(MainMenuUI.class.getClassLoader().getResourceAsStream(imageLocation + menuTitle[index] + "hover.png")));
            buttonLogoHover.setPreserveRatio(true);
            buttonLogoHover.setFitWidth(400);
            buttonLogoHover.setSmooth(false);
            but.setGraphic(buttonLogo);
            but.setOnMouseEntered(event -> but.setGraphic(buttonLogoHover));
            but.setOnMouseExited(event -> but.setGraphic(buttonLogo));

        } catch (Exception e) {
            System.out.println("MainMenuUI: Can't find image for menu button " + menuTitle[index] + "!");
            but.setText(menuTitle[index]);
            but.setFont(cloud18);
        }
        but.setPrefSize(150.0, 25.0);
        //but.setEffect(ds);
        but.setBorder(null);
        but.setBackground(null);
        but.setPadding(new Insets(5, 0, 5, 0));
        return but;

    }
}
