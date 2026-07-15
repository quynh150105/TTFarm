package quynh.family.TTFarm.order.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import quynh.family.TTFarm.customer.domain.entity.Customer;
import quynh.family.TTFarm.common.unums.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private String id;

    private String orderCode;

    @ManyToOne
    private Customer customer;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    private LocalDateTime pickupTime;

    @OneToMany(mappedBy="order")
    private List<OrderItem> items;
}
