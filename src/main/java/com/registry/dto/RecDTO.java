package com.registry.dto;

import lombok.Data;

@Data
public class RecDTO implements CommonDTO {

    private String type;

    private Object raw;

}
