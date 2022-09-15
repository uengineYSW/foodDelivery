package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CookingStarted extends AbstractEvent {

    private Long id;
    private Long orderId;

    public CookingStarted(Order aggregate) {
        super(aggregate);
    }

    public CookingStarted() {
        super();
    }
    // keep

}
