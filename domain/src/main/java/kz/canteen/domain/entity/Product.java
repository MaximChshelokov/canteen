package kz.canteen.domain.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    @Size(max = 128)
    private String name;
    @Column(name = "discription")
    @Size(max = 256)
    private String description;
    @Column(name = "details")
    @Size(max = 1024)
    private String details;
    @Column(name = "image")
    private byte[] image;
}
