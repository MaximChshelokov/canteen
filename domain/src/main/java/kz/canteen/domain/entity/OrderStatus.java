package kz.canteen.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "order_status")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderStatus implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_status_id_seq")
    @SequenceGenerator(name = "order_status_id_seq", sequenceName = "order_status_id_seq", allocationSize = 1)
    private int id;

    @Column(name = "name", nullable = false, length = 16)
    private String name;
}
