package kz.canteen.domain.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customer")
@Getter
@Setter
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
