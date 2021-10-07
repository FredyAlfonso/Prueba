package com.prueba.prueba.DTO;

import lombok.Data;

import java.io.Serializable;

@Data
public class RequestDTO implements Serializable {
    private String identificadorCaso;
    private String codigoSkill;
}
