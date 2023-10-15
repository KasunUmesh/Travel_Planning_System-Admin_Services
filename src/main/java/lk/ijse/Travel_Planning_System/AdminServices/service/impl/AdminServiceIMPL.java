package lk.ijse.Travel_Planning_System.AdminServices.service.impl;

import lk.ijse.Travel_Planning_System.AdminServices.dto.AdminDTO;
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
    
    @Override
    public AdminDTO saveAdmin(AdminDTO adminDTO) {
        return null;
    }
}