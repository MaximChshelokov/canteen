package kz.canteen.domain.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    @Size(max = 64)
    private String name;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "phone_number")
    @Size(max = 11)
    @NotNull
    private String phoneNumber;
    @Column(name = "email")
    @Size(max = 64)
    private String email;
}
