package com.applicationmaker.model.entity.html;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Link {
    private String rel;
    private String href;

    @Override
    public String toString() {
        return "<" +
                getClass().getName().toLowerCase() +
                " href=" + "\"" + href + "\"" +
                " rel=" + "\"" + rel + "\"" +
                ">" +
                "</" +
                getClass().getName().toLowerCase() +
                ">";
    }
}
