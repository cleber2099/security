package com.spring.security.costumer;


/*
*           Classe imutavel que eu vou usar ppara comparar o custumer no update
*
*
* */
public record CustumerUpdateRequest(
        String name,
        String email,
        Integer age) {

}
