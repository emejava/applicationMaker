package entity.html;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Meta {
    private String name;
    private String content;
    private String charSet;

    @Override
    public String toString() {
        return "<" +
                getClass().getName().toLowerCase() +
                " name=" + "\"" + name + "\"" +
                " content=" + "\"" + content + "\"" +
                " charset=" + "\"" + charSet + "\"" +
                ">" +
                "</" +
                getClass().getName().toLowerCase() +
                ">";
    }
}
