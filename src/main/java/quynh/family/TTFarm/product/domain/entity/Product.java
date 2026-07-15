package quynh.family.TTFarm.product.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import quynh.family.TTFarm.category.domain.entity.Category;
import quynh.family.TTFarm.common.unums.ProductStatus;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "TEXT")
    private String features; // Đặc điểm sản phẩm

    @Column(columnDefinition = "TEXT")
    private String cookingGuide; // Cách chế biến gợi ý

    private String thumbnail;
    private String origin;

    @Enumerated(EnumType.STRING)
    private ProductStatus status;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}