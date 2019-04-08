package kz.canteen.domain.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;

@Entity
@Table(name = "product")
@Data
@Builder
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_seq")
    @SequenceGenerator(name = "product_id_seq", sequenceName = "product_id_seq", allocationSize = 1)
    private long id;

    @Column(name = "name", nullable = false, length = 128)
    private String name;

    @Column(name = "description", nullable = false, length = 256)
    private String description;

    @Column(name = "details", nullable = false, length = 1024)
    private String details;

    @Lob
    @Column(name = "image")
    private Blob image;
}
