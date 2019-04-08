package kz.canteen.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_role")
@Data
@AllArgsConstructor
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_role_id_seq")
    @SequenceGenerator(name = "user_role_id_seq", sequenceName = "user_role_id_seq", allocationSize = 1)
    private int id;

    @Column(name = "name", nullable = false, length = 10)
    private String roleName;
}
