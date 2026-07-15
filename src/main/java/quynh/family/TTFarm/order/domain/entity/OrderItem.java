package quynh.family.TTFarm.order.domain.entity;


import jakarta.persistence.*;
import quynh.family.TTFarm.dailycatch.domain.entity.DailyCatchItem;
import quynh.family.TTFarm.common.unums.ProcessingType;

import java.math.BigDecimal;

@Entity
@Table(name="order_items")
public class OrderItem {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private String id;

    @ManyToOne
    private Order order;

    @ManyToOne
    private DailyCatchItem dailyCatchItem;

    private Double quantity;

    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private ProcessingType processingType;
}
