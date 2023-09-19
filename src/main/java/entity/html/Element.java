package entity.html;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder
public class Element {
    private String id;
    private String classAttribute;
    private Style style;

    @Override
    public String toString() {
        return super.toString();
    }
}
