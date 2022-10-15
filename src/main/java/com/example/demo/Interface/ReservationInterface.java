/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.Interface;

import com.example.demo.Modelo.Reservation;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author casa2023
 */
public interface ReservationInterface extends CrudRepository <Reservation, Integer>{ /*tipo de dato de la llave*/
    
}
