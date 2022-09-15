package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderAdded extends AbstractEvent {

    private Long id;

    public OrderAdded(Order aggregate) {
        super(aggregate);
    }

    public OrderAdded() {
        super();
    }
    // keep

}
