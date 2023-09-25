package com.applicationmaker.model.entity.html;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class A extends Element{
    private String href;
    private String text;


    @Override
    public String toString() {
        return "<" +
                getClass().getName().toLowerCase() +
                " id=" + "\"" + getIdName() + "\"" +
                " style=" + "\"" + getStyle() + "\"" +
                " class=" + "\"" + getClassName() + "\"" +
                " href=" + "\"" + href + "\"" +
                ">" +
                text +
                "</" +
                getClass().getName().toLowerCase() +
                ">";
    }
}
