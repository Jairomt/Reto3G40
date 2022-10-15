/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.CategoryInterface;
import com.example.demo.Modelo.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author casa2023
 */

@Repository /*anotación para declarar la clase como un repositorio*/

public class CategoryRepository {
    @Autowired /*sirve para poder traer métodos de otras clases o interfaces*/
    private CategoryInterface extencionesCrud;
    
    public List <Category> getAll(){
        return (List<Category>) extencionesCrud.findAll();
    }
    
    public Optional <Category> getCategory(int id){
        return extencionesCrud.findById(id);
    }
    
    public Category save (Category category) {
        return extencionesCrud.save(category);
    }
    
}
