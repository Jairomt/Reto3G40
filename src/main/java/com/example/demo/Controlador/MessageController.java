/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controlador;

import com.example.demo.Modelo.Message;
import com.example.demo.Servicio.MessageService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author casa2023
 */

@RestController /*permite habilitar esta clase cómo una controlador que le permita tener todas lafuncionalidades de tipo rest*/
@RequestMapping("/api/Message") /*se le da nombre a la url a los empoint al back*/

public class MessageController {
    @Autowired
    private MessageService messageService; /*se tare la clase del paquete anterior*/

    @GetMapping("/all") /*complemento a la url /api/Category permite poder leer la tabla y los datos*/
    public List<Message> getAll(){
        return messageService.getAll();
    }
    
    @GetMapping("/{id}") /*para poder utilizar la url capturando el dato*/
    public Optional<Message>getMessage(@PathVariable("id") int id){
        return messageService.getMessage(id);
    }
    
    @PostMapping("/save") /*en la url que tenga esa terminación vamos a crear*/
    @ResponseStatus(HttpStatus.CREATED)/*devuelve el estaus del request*/
    public Message save(@RequestBody Message message){
        return messageService.save(message);
    }
}
