package com.registry.dto;

import lombok.Data;

@Data
public class ProductDTO implements CommonDTO {

    private String name;

    private Double valor;
    @Override
    public String getType() {
        return "ProductDTO";
    }
}
