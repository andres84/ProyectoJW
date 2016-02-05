
package Controller;

import Model.Persona;
import Model.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named
@ViewScoped
public class UsuarioController implements Serializable{
    
    private Usuario usuario;
    private Persona persona;
    
    @PostConstruct // 
    public void init(){
        
        usuario = new Usuario();
        persona = new Persona();
        
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
