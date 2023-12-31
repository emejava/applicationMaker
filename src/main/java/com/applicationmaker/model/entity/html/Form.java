package com.applicationmaker.model.entity.html;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Form extends Element{
    private String action;
    private String method;

    @Override
    public String toString() {
        return "<" +
                getClass().getName().toLowerCase() +
                " id=" + "\"" + getIdName() + "\"" +
                " style=" + "\"" + getStyle() + "\"" +
                " class=" + "\"" + getClassName() + "\"" +
                " action=" + "\"" + action + "\"" +
                " method=" + "\"" + method + "\"" +
                ">" +
                "</" +
                getClass().getName().toLowerCase() +
                ">";
    }
}
