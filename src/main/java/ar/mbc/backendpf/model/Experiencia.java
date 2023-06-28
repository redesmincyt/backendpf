
package ar.mbc.backendpf.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Experiencia {
    
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
