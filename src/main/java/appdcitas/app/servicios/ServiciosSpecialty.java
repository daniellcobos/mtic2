/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appdcitas.app.servicios;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import appdcitas.app.modelo.Specialty;
import appdcitas.app.repositorio.RepositorioSpecialty;

/**
 *
 * @author USUARIO
 */

@Service
public class ServiciosSpecialty {
    @Autowired
    private RepositorioSpecialty metodosCrud;
    
    public List<Specialty> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Specialty> getCategoria(int idCategoria){
        return metodosCrud.getCategoria(idCategoria);
    }
    
    public Specialty save(Specialty categoria){
        if(categoria.getId()==null){
            return metodosCrud.save(categoria);
        }else{
            Optional<Specialty> evt=metodosCrud.getCategoria(categoria.getId());
            if(evt.isEmpty()){
                return metodosCrud.save(categoria);
            }else{
                return categoria;
            }
        }
    }
    public Specialty update(Specialty categoria){
        if(categoria.getId()!=null){
            Optional<Specialty>g=metodosCrud.getCategoria(categoria.getId());
            if(!g.isEmpty()){
                if(categoria.getDescription()!=null){
                    g.get().setDescription(categoria.getDescription());
                }
                if(categoria.getName()!=null){
                    g.get().setName(categoria.getName());
                }
                return metodosCrud.save(g.get());
            }
        }
        return categoria;
    }
    public boolean deleteCategoria(int categoriaId){
        Boolean d=getCategoria(categoriaId).map(categoria -> {
            metodosCrud.delete(categoria);
            return true;
        }).orElse(false);
        return d;
    }
}
