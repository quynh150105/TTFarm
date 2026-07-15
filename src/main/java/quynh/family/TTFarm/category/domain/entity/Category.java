package quynh.family.TTFarm.category.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import quynh.family.TTFarm.product.domain.entity.Product;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String description;

    @OneToMany(mappedBy="category")
    private List<Product> products;
}
