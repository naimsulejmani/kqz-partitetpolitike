package ict.kqz.kqzpartitetpolitike.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginModel {
    private String username;
    private String password;

    @Override
    public String toString() {
        return "username: " + username + "; password=" + password;
    }
}
