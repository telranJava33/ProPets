package telran.propets.accounting.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginDto {
    @JsonProperty
    String email;
    @JsonProperty
    String password;

    public LoginDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


}
