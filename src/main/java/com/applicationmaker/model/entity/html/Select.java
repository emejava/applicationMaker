package com.applicationmaker.model.entity.html;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Select extends Element{
    private List<Option> option;
    private String name;

    @Override
    public String toString() {
        return "<" +
                getClass().getName().toLowerCase() +
                " id=" + "\"" + getIdName() + "\"" +
                " style=" + "\"" + getStyle() + "\"" +
                " class=" + "\"" + getClassName() + "\"" +
                " name= " + "\"" + name + "\"" +
                ">" +
                option +
                "</" +
                getClass().getName().toLowerCase() +
                ">";
    }
}
