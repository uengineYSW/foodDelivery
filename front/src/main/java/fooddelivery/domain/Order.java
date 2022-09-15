package fooddelivery.domain;

import fooddelivery.FrontApplication;
import fooddelivery.domain.FoodOrdered;
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

    private Long storeId;

    private Long menuId;

    private Integer quantity;

    @Embedded
    private Address address;

    private String require;

    @Embedded
    private Money price;

    private Boolean isPaid;

    @PostPersist
    public void onPostPersist() {
        FoodOrdered foodOrdered = new FoodOrdered(this);
        foodOrdered.publishAfterCommit();
    }

    public static OrderRepository repository() {
        OrderRepository orderRepository = FrontApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }

    public void cancelOrder() {
        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();
    }

    public void pay() {
        OrderPaid orderPaid = new OrderPaid(this);
        orderPaid.publishAfterCommit();
    }
}
