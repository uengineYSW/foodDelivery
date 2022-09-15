package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class PromotedSimilarMenu extends AbstractEvent {

    private Long id;

    public PromotedSimilarMenu(Preference aggregate) {
        super(aggregate);
    }

    public PromotedSimilarMenu() {
        super();
    }
    // keep

}
