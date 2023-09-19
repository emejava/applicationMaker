package entity.html;

import entity.html.enums.BorderStyle;
import entity.html.enums.FontFamily;
import entity.html.enums.TextAlign;
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
