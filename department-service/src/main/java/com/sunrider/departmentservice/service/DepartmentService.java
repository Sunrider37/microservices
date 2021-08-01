package com.sunrider.departmentservice.service;

import com.sunrider.departmentservice.entity.Department;
import com.sunrider.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {


    private final DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department saveDepartment(Department department) {
        log.info("inside saveDepartment of departmentService");
        return  departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departId){
        return departmentRepository.findByDepartmentId(departId).orElseThrow();
    }
}
