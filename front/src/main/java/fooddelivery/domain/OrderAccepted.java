package fooddelivery.domain;

import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String price;
    private String qty;
    private Boolean isCanceled;
    private Boolean isStarted;
    private Boolean isEnded;
}
