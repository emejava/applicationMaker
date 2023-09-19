package entity.html;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Td extends Element {
    private String text;

    @Override
    public String toString() {
        return "<" +
                getClass().getName().toLowerCase() +
                " id=" + "\"" + getId() + "\"" +
                " style=" + "\"" + getStyle() + "\"" +
                " class=" + "\"" + getClassAttribute() + "\"" +
                ">" +
                text +
                "</" +
                getClass().getName().toLowerCase() +
                ">";
    }
}
