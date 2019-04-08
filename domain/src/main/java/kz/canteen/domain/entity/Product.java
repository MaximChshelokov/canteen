package kz.canteen.domain.entity;

import lombok.Data;
import javax.persistence.*;
import java.sql.Blob;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "name",nullable = false,length = 128)
    private String name;

    @Column(name = "description",nullable = false,length = 256)
    private String description;

    @Column(name = "details",nullable = false,length = 1024)
    private String details;

    @Lob
    @Column(name = "image")
    private Blob image;
}
