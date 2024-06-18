package alessiovulpinari.u2_w1_d2_Java.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Topping extends MenuElement{

    public Topping(String name, Double price, int calories) {
        super(name, price, calories);
    }
}
