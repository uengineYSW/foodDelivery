package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class OrderRefused extends AbstractEvent {

    private Long id;
    private Long orderId;
}
