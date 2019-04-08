package kz.canteen.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "order")
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "created_at")
    @NotNull
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    @Column(name = "total_price")
    @NotNull
    private BigDecimal totalPrice;
    @Column(name = "customer")
    @ManyToOne
    private Customer customer;
    @Column(name = "order_status")
    @ManyToOne
    private OrderStatus orderStatus;
    @ManyToMany(fetch = FetchType.EAGER,
        cascade = CascadeType.ALL)
    @JoinTable(name = "order_product",
        joinColumns = {@JoinColumn(name = "order_id")},
        inverseJoinColumns = {@JoinColumn(name = "product_id")})
    private List<Product> orderProducts = new ArrayList<>();
}
