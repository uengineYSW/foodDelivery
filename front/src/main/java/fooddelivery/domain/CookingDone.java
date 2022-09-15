package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class CookingDone extends AbstractEvent {

    private Long id;
    private Long orderId;
}
