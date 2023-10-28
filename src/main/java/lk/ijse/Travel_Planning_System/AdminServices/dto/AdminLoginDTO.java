package lk.ijse.Travel_Planning_System.AdminServices.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AdminLoginDTO {

    private String loginEmail;
    private String loginPassword;
}
