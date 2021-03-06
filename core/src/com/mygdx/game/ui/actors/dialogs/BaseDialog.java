package com.mygdx.game.ui.actors.dialogs;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;

/**
 * Created by Lee on 2016-06-06.
 */
public abstract class BaseDialog extends Window {
    public BaseDialog(String title, Skin skin) {
        super(title, skin);
    }

    public BaseDialog(String title, Skin skin, String styleName) {
        super(title, skin, styleName);
    }

    public WindowStyle getWindowStyle(Skin skin, BitmapFont font) {
        return new WindowStyle(font, skin.getColor("white"), skin.getDrawable("default-window"));
    }

    public TextButton.TextButtonStyle getTextButtonStyle(Skin skin, BitmapFont font) {
        return new TextButton.TextButtonStyle(skin.getDrawable("default-round"), skin.getDrawable("default-round-down"), skin.getDrawable("default-round"), font);
    }

    public TextField.TextFieldStyle getTextFieldStyle(Skin skin, BitmapFont font) {
        return new TextField.TextFieldStyle(font, skin.getColor("white"), skin.getDrawable("cursor"), skin.getDrawable("selection"), skin.getDrawable("textfield"));
    }

    public Label.LabelStyle getLabelStyle(Skin skin, BitmapFont font) {
        return new Label.LabelStyle(font, skin.getColor("white"));
    }

    public List.ListStyle getListStyle(Skin skin, BitmapFont font) {
        return new List.ListStyle(font, skin.getColor("white"), skin.getColor("white"), skin.getDrawable("selection"));
    }

    public ScrollPane.ScrollPaneStyle getScrollPaneStyle(Skin skin, BitmapFont font) {
        return new ScrollPane.ScrollPaneStyle(skin.getDrawable("default-rect"), skin.getDrawable("default-scroll"), skin.getDrawable("default-round-large"), skin.getDrawable("default-scroll"), skin.getDrawable("default-round-large"));
    }


    public SelectBox.SelectBoxStyle getSelectBoxStyle(Skin skin, BitmapFont font) {
        return new SelectBox.SelectBoxStyle(font, skin.getColor("white"), skin.getDrawable("default-select"), getScrollPaneStyle(skin, font), new List.ListStyle(font, skin.getColor("black"), skin.getColor("white"), skin.getDrawable("default-select-selection")));
    }

}
