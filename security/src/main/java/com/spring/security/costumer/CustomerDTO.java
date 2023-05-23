package com.spring.security.costumer;


import java.util.List;
/*
* É A REPREENTAÇÃO DO MEU OBJETO CUSTOMER,
* POSSO REPRESENTAR DE VARIAS FORMAS DIFERENTES NO  MEU SISTEMA
*
* */
public record CustomerDTO(
        Integer id,
        String name,
        String email,
        Gender gender,
        Integer age,
        List<String> roles,
        String username/*,
       /* String profileImageId*/
) {

}