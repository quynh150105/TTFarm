package quynh.family.TTFarm.product.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="product_images")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductImage {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;

    private String imageUrl;

    private Integer displayOrder;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;
}
