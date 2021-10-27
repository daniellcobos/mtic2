/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package appdcitas.app.interfaces;

import org.springframework.data.repository.CrudRepository;

import appdcitas.app.modelo.Specialty;

/**
 *
 * @author USUARIO
 */
public interface InterfaceSpecialty extends CrudRepository<Specialty,Integer> {
    
}
