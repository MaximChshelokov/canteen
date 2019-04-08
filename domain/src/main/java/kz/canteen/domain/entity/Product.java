package kz.canteen.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "product")
@Getter
@Setter
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
