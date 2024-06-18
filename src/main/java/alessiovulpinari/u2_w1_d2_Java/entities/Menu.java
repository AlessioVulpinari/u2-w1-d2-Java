package alessiovulpinari.u2_w1_d2_Java.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

    List<Pizza> pizzas;
    List<Topping> toppings;
    List<Drink> drinks;
}
