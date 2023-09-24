package com.applicationmaker.model.entity.html;

import com.applicationmaker.model.entity.html.enums.InputType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Input extends Element{
    private InputType type;
    private String name;
    private String placeHolder;
    private String value;

    @Override
    public String toString() {
        return "<" +
                getClass().getName().toLowerCase() +
                " id=" + "\"" + getIdName() + "\"" +
                " style=" + "\"" + getStyle() + "\"" +
                " class=" + "\"" + getClassName() + "\"" +
                " type= " + "\"" + String.valueOf(type).replace("_","-") + "\"" +
                " name= " + "\"" +  name + "\"" +
                " placeholder= " + "\"" +  placeHolder + "\"" +
                " value= " + "\"" +  value + "\"" +
                ">" +
                "</" +
                getClass().getName().toLowerCase() +
                ">";
    }
}
