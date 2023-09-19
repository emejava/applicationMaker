package com.applicationmaker.model.entity.html;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Input extends Element{
    private String type;
    private String name;
    private String placeHolder;

    @Override
    public String toString() {
        return "<" +
                getClass().getName().toLowerCase() +
                " id=" + "\"" + getId() + "\"" +
                " style=" + "\"" + getStyle() + "\"" +
                " class=" + "\"" + getClassAttribute() + "\"" +
                " type= " + type +
                " name= " + name +
                " placeholder= " + placeHolder +
                ">" +
                "</" +
                getClass().getName().toLowerCase() +
                ">";
    }
}
