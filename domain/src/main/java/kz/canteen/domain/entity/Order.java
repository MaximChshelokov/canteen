package kz.canteen.domain.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "order")
@Data
@Builder
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_id_seq")
    @SequenceGenerator(name = "order_id_seq", sequenceName = "order_id_seq", allocationSize = 1)
    private long id;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "total_price", nullable = false)
    private BigDecimal totalPrice;

    @Column(name = "customer", nullable = false)
    @ManyToOne
    private Customer customer;

    @Column(name = "order_status", nullable = false)
    @ManyToOne
    private OrderStatus orderStatus;

    @ManyToMany(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    @JoinTable(name = "order_product",
            joinColumns = {@JoinColumn(name = "order_id")},
            inverseJoinColumns = {@JoinColumn(name = "product_id")})
    private List<Product> orderProducts;
}
