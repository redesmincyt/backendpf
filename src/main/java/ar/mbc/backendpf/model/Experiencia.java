
package ar.mbc.backendpf.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author marta
 */
@Getter @Setter
public class Experiencia {
    
    private Long id;
    private String explogo;
    private String empresa;
    private String puesto;
    private String detalle;
    private String periodo;
    
    /**
     *
     */
    public Experiencia(){
        
    }

    /**
     *
     * @param id
     * @param explogo
     * @param empresa
     * @param puesto
     * @param detalle
     * @param periodo
     */
    public Experiencia(Long id, String explogo, String empresa, String puesto, String detalle, String periodo){
        this.id = id;
        this.explogo = explogo;
        this.empresa = empresa;
        this.puesto = puesto;
        this.detalle = detalle;
        this.periodo = periodo;
        
    }
}
