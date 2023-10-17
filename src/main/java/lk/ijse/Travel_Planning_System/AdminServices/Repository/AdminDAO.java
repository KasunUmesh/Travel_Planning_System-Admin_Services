package lk.ijse.Travel_Planning_System.AdminServices.Repository;

import lk.ijse.Travel_Planning_System.AdminServices.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDAO extends JpaRepository<Admin, String> {
    Admin save(Admin admin);
}
