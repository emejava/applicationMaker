package entity.html;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Body extends Element{
    private String dir;
    private String tags;

    @Override
    public String toString() {
        return "<" +
                getClass().getName().toLowerCase() +
                " id=" + "\"" + getId() + "\"" +
                " style=" + "\"" + getStyle() + "\"" +
                " class=" + "\"" + getClassAttribute() + "\"" +
                " dir=" +
                "\"" + dir + "\"" +
                ">" +
                tags +
                "</" +
                getClass().getName().toLowerCase() +
                ">";
    }
}
