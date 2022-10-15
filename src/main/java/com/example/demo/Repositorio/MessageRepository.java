/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.MessageInterface;
import com.example.demo.Modelo.Message;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author casa2023
 */
@Repository /*anotación para declarar la clase como un repositorio*/
public class MessageRepository {
    @Autowired /*sirve para poder traer métodos de otras clases o interfaces*/
    private MessageInterface extencionesCrud;
    
    public List <Message> getAll(){
        return (List<Message>) extencionesCrud.findAll();
    }
    
    public Optional <Message> getMessage(int id){
        return extencionesCrud.findById(id);
    }
    
    public Message save (Message message) {
        return extencionesCrud.save(message);
    }
}
