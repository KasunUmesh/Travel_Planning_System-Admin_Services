package lk.ijse.Travel_Planning_System.AdminServices.api;

import lk.ijse.Travel_Planning_System.AdminServices.dto.AdminDTO;
import lk.ijse.Travel_Planning_System.AdminServices.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Base64;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {

    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = {MediaType.MULTIPART_FORM_DATA_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    AdminDTO saveAdmin(
                       @RequestParam("adminName") String adminName,
                       @RequestParam("adminPassword") String adminPassword,
                       @RequestParam("adminIMG") MultipartFile file) {

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        if (fileName.contains("..")) {
            System.out.println("Not a valid file");
        }

        String convertedIMG;
        try {
            convertedIMG = Base64.getEncoder().encodeToString(file.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        AdminDTO adminDTO = new AdminDTO();

        adminDTO.setAdminName(adminName);
        adminDTO.setAdminPassword(adminPassword);
        adminDTO.setAdminIMG(convertedIMG);

        System.out.println(adminName);
        System.out.println(adminPassword);
        System.out.println(file);

        return adminService.saveAdmin(adminDTO);
    }
}
