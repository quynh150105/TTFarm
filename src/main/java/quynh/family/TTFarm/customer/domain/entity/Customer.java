package quynh.family.TTFarm.customer.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name="customers")
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    private String id;

    private String fullname;

    private String phone;

    private String address;

}
