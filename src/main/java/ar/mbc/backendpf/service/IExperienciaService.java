
package ar.mbc.backendpf.service;

import ar.mbc.backendpf.model.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia();
    public void addExperiencia (Experiencia expe);
    public void borrarExperiencia (Long id);
    
}
