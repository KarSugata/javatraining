package com.sap.scholar.springdemo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EmployeeResponse {
    // @JsonProperty(value = "employeeId")
    private String empId;
    // @JsonProperty(value = "employeeId")
    private String name;
    // @JsonProperty(value = "employeeId")
    private int age;
}
