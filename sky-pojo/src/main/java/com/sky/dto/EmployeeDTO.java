package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

//员工类
@Data
public class EmployeeDTO implements Serializable {

    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}
