package lk.ijse.Travel_Planning_System.AdminServices.service.impl;

import lk.ijse.Travel_Planning_System.AdminServices.dto.AdminDTO;
import lk.ijse.Travel_Planning_System.AdminServices.Repository.AdminDAO;
import lk.ijse.Travel_Planning_System.AdminServices.service.AdminService;
import lk.ijse.Travel_Planning_System.AdminServices.util.DataTypeConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceIMPL implements AdminService {

    @Autowired
    private DataTypeConversion dataTypeConversion;

    @Autowired
    private AdminDAO adminDAO;

    @Override
    public AdminDTO saveAdmin(AdminDTO adminDTO) {
        return dataTypeConversion.getAdminDTO(adminDAO.save(dataTypeConversion.getAdminEntity(adminDTO)));
    }
}
