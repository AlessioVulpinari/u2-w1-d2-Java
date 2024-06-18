package alessiovulpinari.u2_w1_d2_Java.entities;

import alessiovulpinari.u2_w1_d2_Java.enums.OrderState;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private int orderNumber;
    private Table table;
    private List<MenuElement> menuElements;
    private OrderState state;
    private int copertoNumber;
    private LocalDate acquisitionDate;
    private double totalPrice;

}
