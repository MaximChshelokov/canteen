package kz.canteen.domain.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long userId;

    @Column(name = "column",nullable = false,length = 64)
    private String email;

    @Column(name = "login",nullable = false,length = 32)
    private String login;

    @Column(name = "password",nullable = false,length = 128)
    private String password;

    @Column(name = "phone_number")
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private UserRole role;

    @ManyToOne(fetch = FetchType.EAGER)
    private UserStatus status;
}
