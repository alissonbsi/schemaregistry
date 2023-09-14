package com.registry.dto;

import com.registry.avro.business.Role;
import lombok.Data;

@Data
public class BusinessRuleDTO implements CommonDTO {

    private String nome;

    private Role role;

    @Override
    public String getType() {
        return "BusinessRule";
    }
}
