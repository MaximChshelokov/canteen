package kz.canteen.domain.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "name",nullable = false,length = 64)
    private String name;

    @Column(name = "birth_date",nullable = false)
    private LocalDate birthDate;

    @Column(name = "phone_number",nullable = false,length = 11,unique = true)
    private String phoneNumber;

    @Column(name = "email",nullable = false,length = 64)
    private String email;
}
