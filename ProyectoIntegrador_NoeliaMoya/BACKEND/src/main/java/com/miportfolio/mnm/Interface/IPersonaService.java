package com.miportfolio.mnm.Interface;

import com.miportfolio.mnm.Entity.Persona;
import java.io.Serializable;
import java.util.List;
import javax.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;


public interface IPersonaService {
    // Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona (Persona persona);
    
    //Eliminar un Usuario pero lo buscamos por ID
    public void deletePersona (Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);

    public Persona findPersona(SingularAttribute<AbstractPersistable, Serializable> id);
    
   
}
