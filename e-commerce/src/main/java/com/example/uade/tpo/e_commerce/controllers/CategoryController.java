package com.example.uade.tpo.e_commerce.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController//declarar que esta clase es un endpoint http con lo que yo defina que pase aca adentro
@RequestMapping("categories")//que responda con la uri que empiece con la palabra categories
                                            
//CUANDO ES GET SE PIDE INFORMACION
//CUANDO ES POST SE GUARDA INFORMACION
//CUANDO ES PUT SE QUIERE PONER INFORMACION
//CUANDO ES DELETE QUERES BORRAR INFORMACION
//todo esto se refiere de hacer algo en la base de datos

public class CategoryController {


    @GetMapping//Este get trae toda la informacion de todas las categorias que tengo en mi base de datos
    public String getCateories() {
        return new String();

    }
    @GetMapping("/{categoryId}")//Este me va a traer todas las categorias que yo elija x id, x ejemplo: /zapatillas, /gorras,etc..
    public String getCategoryById (@PathVariable String categoryId) {//el path tiene que ser variable ya que el Id va a ir cambiando
        
        return new String();
    }
    


    @PostMapping//guardar informacion que le llega cuando yo creo una categoria nueva
    //por ejemplo si un vendedor quiere vender una cartera entonces se crea una nueva categoria "carteras"
    //tiene que hacer todo el proceso post para crear una nueva categoria
    public String createCategory(@RequestBody String entity) {
    //TODO: process POST request
    
    return entity;
    }

}
