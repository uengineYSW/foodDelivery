package fooddelivery.domain;

import fooddelivery.StoreApplication;
import fooddelivery.domain.CookingDone;
import fooddelivery.domain.CookingStarted;
import fooddelivery.domain.OrderAccepted;
import fooddelivery.domain.OrderAdded;
import fooddelivery.domain.OrderCanceled;
import fooddelivery.domain.OrderRefused;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Order_table")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long orderId;

    private String price;

    private String quantity;

    private Boolean isCanceled;

    private Boolean isStarted;

    private Boolean isEnded;

    @PostPersist
    public void onPostPersist() {
        CookingStarted cookingStarted = new CookingStarted(this);
        cookingStarted.publishAfterCommit();

        CookingDone cookingDone = new CookingDone(this);
        cookingDone.publishAfterCommit();

        OrderAccepted orderAccepted = new OrderAccepted(this);
        orderAccepted.publishAfterCommit();

        OrderRefused orderRefused = new OrderRefused(this);
        orderRefused.publishAfterCommit();

        OrderAdded orderAdded = new OrderAdded(this);
        orderAdded.publishAfterCommit();

        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();
    }

    public static OrderRepository repository() {
        OrderRepository orderRepository = StoreApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }

    public void cookDone() {}

    public void refuseOrder() {}

    public void acceptOrder() {}

    public void cook() {}

    public static void cancelOrder(OrderCanceled orderCanceled) {
        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

    }

    public static void foodOrderList(OrderPaid orderPaid) {
        /** Example 1:  new item 
        Order order = new Order();
        repository().save(order);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPaid.get???()).ifPresent(order->{
            
            order // do something
            repository().save(order);


         });
        */

    }
}
