package com.applicationmaker.model.entity.html;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Html {
    private String lang;
    private Head head;
    private Body body;

    @Override
    public String toString() {
        return "<" +
                getClass().getName().toLowerCase() +
                " lang=" + "\"" + lang + "\"" +
                ">" +
                head +
                "\n" +
                body +
                "</" +
                getClass().getName().toLowerCase() +
                ">";
    }
}
