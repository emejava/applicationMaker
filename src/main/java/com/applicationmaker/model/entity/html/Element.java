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
public class Element {
    private String idName;
    private String className;
    private List<Style> style;

    @Override
    public String toString() {
        return super.toString();
    }
}
