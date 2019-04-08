package kz.canteen.domain.dto.form;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Data
public class UserCreateForm {
    @Email
    @Size(min = 6, max = 64)
    private String email;

    @Size(min = 5, max = 32)
    private String login;

    @Size(min = 6, max = 16)
    private String password;

    //XXXX
    private String phoneNumber;

}