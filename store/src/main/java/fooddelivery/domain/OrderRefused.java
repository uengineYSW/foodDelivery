package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderRefused extends AbstractEvent {

    private Long id;
    private Long orderId;

    public OrderRefused(Order aggregate) {
        super(aggregate);
    }

    public OrderRefused() {
        super();
    }
    // keep

}
