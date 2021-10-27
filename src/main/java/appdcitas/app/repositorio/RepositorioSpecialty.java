/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appdcitas.app.repositorio;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import appdcitas.app.interfaces.InterfaceSpecialty;
import appdcitas.app.modelo.Specialty;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioSpecialty {
    @Autowired
    private InterfaceSpecialty crud2;
    
     public List<Specialty> getAll(){
        return (List<Specialty>) crud2.findAll();       
    }
    
    public Optional <Specialty> getCategoria(int id){
        return crud2.findById(id);
    }
    
    public Specialty save(Specialty categoria){
        return crud2.save(categoria);
    }
     public void delete(Specialty categoria){
        crud2.delete(categoria);
    }
}
