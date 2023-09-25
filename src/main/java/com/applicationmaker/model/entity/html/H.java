package com.applicationmaker.model.entity.html;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class H extends Element{
    private byte number;
    private String text;

    @Override
    public String toString() {
        return "<" +
                getClass().getName().toLowerCase() + number +
                " id=" + "\"" + getIdName() + "\"" +
                " style=" + "\"" + getStyle() + "\"" +
                " class=" + "\"" + getClassName() + "\"" +
                ">" +
                text +
                "</" +
                getClass().getName().toLowerCase() +
                ">";
    }
}
