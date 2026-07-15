package quynh.family.TTFarm.dailycatch.domain.entity;

import jakarta.persistence.*;
import quynh.family.TTFarm.product.domain.entity.Product;

import java.math.BigDecimal;

@Entity
@Table(name="daily_catch_items")
public class DailyCatchItem {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name="daily_catch_id")
    private DailyCatch dailyCatch;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    private BigDecimal pricePerKg;

    private Double availableQuantity;

    private Double remainingQuantity;
}
