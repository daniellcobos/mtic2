/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appdcitas.app.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import appdcitas.app.interfaces.InterfaceDoctor;

import appdcitas.app.modelo.Doctor;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioDoctor {
     @Autowired
    private InterfaceDoctor crud;
    

    public List<Doctor> getAll(){
        return (List<Doctor>) crud.findAll();       
    }
    
    public Optional <Doctor> getDoctor(int id){
        return crud.findById(id);
    }
    
    public Doctor save(Doctor ortesis){
        return crud.save(ortesis);
    }
      public void delete(Doctor ortesis){
        crud.delete(ortesis);
    }
    
    
}
