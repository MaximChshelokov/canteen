package kz.canteen.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "user_status")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_status_id_seq")
    @SequenceGenerator(name = "user_status_id_seq", sequenceName = "user_status_id_seq", allocationSize = 1)
    private int id;

    @Column(name = "name", nullable = false, length = 10)
    private String statusName;
}
