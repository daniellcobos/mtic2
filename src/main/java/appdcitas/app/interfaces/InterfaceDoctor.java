/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package appdcitas.app.interfaces;

import org.springframework.data.repository.CrudRepository;

import appdcitas.app.modelo.Doctor;


/**
 *
 * @author USUARIO
 */
public interface InterfaceDoctor extends CrudRepository<Doctor,Integer> {
    
}
