package entity.html;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Head {
    private Title title;
    private Meta meta;
    private Link link;

    @Override
    public String toString() {
        return "<" +
                getClass().getName().toLowerCase() +
                ">" +
                title +
                "\n" +
                meta +
                "\n" +
                link +
                "</" +
                getClass().getName().toLowerCase() +
                ">";
    }
}
