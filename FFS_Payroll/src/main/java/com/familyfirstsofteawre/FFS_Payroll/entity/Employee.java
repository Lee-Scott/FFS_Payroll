package com.familyfirstsofteawre.FFS_Payroll.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee{

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String role;


    public boolean equals(Object maybeEmployee){
        if(this == maybeEmployee){
            return true;
        }
        if(!(maybeEmployee instanceof Employee)){
            return false;
        }
        // Test to see if every field is the same
        Employee employee = (Employee) maybeEmployee;

        return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)
                && Objects.equals(this.role, employee.role);

    }

}
