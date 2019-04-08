package kz.canteen.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_product")
@Data
public class OrderProduct {
    @Id
    private long id;



}
