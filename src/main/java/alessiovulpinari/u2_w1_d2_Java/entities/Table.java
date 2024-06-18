package alessiovulpinari.u2_w1_d2_Java.entities;


import alessiovulpinari.u2_w1_d2_Java.enums.TableState;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Table {

   private int tableNumber;
   private int maxCoperti;
   private TableState tableState;
}
