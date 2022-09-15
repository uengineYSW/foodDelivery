package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookingDone extends AbstractEvent {

    private Long id;
    private Long orderId;

    public CookingDone(Order aggregate) {
        super(aggregate);
    }

    public CookingDone() {
        super();
    }
    // keep

}
