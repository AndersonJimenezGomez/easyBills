package com.easybills.restController;

import com.easybills.domain.Role;
import com.easybills.entity.RoleEntity;
import com.easybills.repository.IRoleRepository;
import com.easybills.services.Interfaces.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;




@RestController
@RequestMapping("/role")
@CrossOrigin("http://localhost:4200")
public class RoleRestController {

    @Autowired
    private IRoleService roleService;
    @Autowired
    private IRoleRepository iRoleRepository;

    private Map<String, Object> response = new HashMap<>();
    private HttpStatus status;

    private String message = "Message";

    @GetMapping("/listAll")
    public List<Role> listAll(){
        return roleService.listAll();
    }

    @GetMapping("/findById/{id}")
    public Role findByid(@PathVariable int id){
        return roleService.findById(id);
    }

    @PostMapping("/insert")
    public ResponseEntity <RoleEntity> insert(@RequestBody final Role role){


        roleService.save(role);
        //roleService.save(role);
        status = HttpStatus.CREATED;
        return new ResponseEntity(role, status);
    }




}
