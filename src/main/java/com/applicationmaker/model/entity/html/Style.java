package com.applicationmaker.model.entity.html;

import com.applicationmaker.model.entity.html.enums.BorderStyle;
import com.applicationmaker.model.entity.html.enums.FontFamily;
import com.applicationmaker.model.entity.html.enums.TextAlign;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Style {
    private String color;
    private String backgroundColor;
    private TextAlign textAlign;
    private String margin;
    private String padding;
    private String border;
    private BorderStyle borderStyle;
    private FontFamily fontFamily;
    private FontFamily width;
    private FontFamily height;

    @Override
    public String toString() {
        return
                getClass().getName().toLowerCase() + "=\""+
                " color:" + color + ";" +
                " background-color:" + color + ";" +
                " text-align:" + textAlign + ";" +
                " margin:" + textAlign + ";" +
                " padding:" + padding + ";" +
                " border:" + border + ";" +
                " border-style:" + borderStyle + ";" +
                " font-family:" + fontFamily + ";" +
                "\"";
    }
}
