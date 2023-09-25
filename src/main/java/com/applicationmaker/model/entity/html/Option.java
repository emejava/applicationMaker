package com.applicationmaker.model.entity.html;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Option extends Element {
    private String selected;
    private String value;
    private String text;

    @Override
    public String toString() {
        return "<" +
                getClass().getName().toLowerCase() +
                " id=" + "\"" + getIdName() + "\"" +
                " style=" + "\"" + getStyle() + "\"" +
                " class=" + "\"" + getClassName() + "\"" +
                " value= " + "\"" + value + "\"" +
                selected +
                ">" +
                text +
                "</" +
                getClass().getName().toLowerCase() +
                ">";
    }
}
