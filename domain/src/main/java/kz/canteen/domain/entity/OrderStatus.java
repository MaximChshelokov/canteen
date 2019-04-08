package kz.canteen.domain.entity;

import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "order_status")
@Data
public class OrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name = "name",nullable = false,length = 16)
    private String name;
}
