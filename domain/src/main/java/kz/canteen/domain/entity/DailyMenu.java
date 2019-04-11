package kz.canteen.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "daily_menu")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DailyMenu {

    @Id
    private long product;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "quantity")
    private float quantity;

    @OneToOne
    @JoinColumn(name = "product")
    private Product productEntity;
}
