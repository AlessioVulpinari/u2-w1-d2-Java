package alessiovulpinari.u2_w1_d2_Java.entities;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class MenuElement {

    protected String name;
    protected Double price;
    protected int calories;
}
