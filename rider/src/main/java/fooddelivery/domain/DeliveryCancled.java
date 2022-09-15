package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryCancled extends AbstractEvent {

    private Long id;

    public DeliveryCancled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCancled() {
        super();
    }
    // keep

}
