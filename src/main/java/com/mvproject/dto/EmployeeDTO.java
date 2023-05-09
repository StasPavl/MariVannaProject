package com.mvproject.dto;

import com.mvproject.enums.State;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String SSN;
    private LocalDate birthDay;
    private LocalDate startDate;
    private String address;
    private RoleDTO role;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
}
