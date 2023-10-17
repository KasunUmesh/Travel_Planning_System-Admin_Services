package lk.ijse.Travel_Planning_System.AdminServices.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Admin implements SuperEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String adminID;
    @Column(nullable = false)
    private String adminName;
    @Column(nullable = false)
    private String adminPassword;
    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String adminIMG;
}
