package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FoodOrdered extends AbstractEvent {

    private Long id;
    private Long orderId;
    private Long price;

    public FoodOrdered(Order aggregate) {
        super(aggregate);
    }

    public FoodOrdered() {
        super();
    }
    // keep

}
