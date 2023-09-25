package com.applicationmaker.model.entity.html;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Script {
    private String src;

    @Override
    public String toString() {
        return "<" +
                getClass().getName().toLowerCase() +
                " src=" + "\"" + src + "\"" +
                ">" +
                "</" +
                getClass().getName().toLowerCase() +
                ">";
    }
}
