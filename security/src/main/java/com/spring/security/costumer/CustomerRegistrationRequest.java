package com.spring.security.costumer;


/*
*
*
* RECORD É UM CLASSE  DE DADOS  IMUTAVEIS
* NESSE CASO SERÃO DADOS QUE OBRIGATORIOS PARA REGISTRAR UM COSTUMER
*
*
* */
public record CustomerRegistrationRequest (
        String name,
        String email,
        String password,
        Integer age,
        Gender gender) {
}
