
package ar.mbc.backendpf.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String explogo;
    private String empresa;
    private String puesto;
    private String detalle;
    private String periodo;
    
     public Experiencia(){
        
    }


    public Experiencia(Long id, String explogo, String empresa, String puesto, String detalle, String periodo){
        this.id = id;
        this.explogo = explogo;
        this.empresa = empresa;
        this.puesto = puesto;
        this.detalle = detalle;
        this.periodo = periodo;
        
    }
}
