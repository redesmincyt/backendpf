
package ar.mbc.backendpf.service;

import ar.mbc.backendpf.model.Experiencia;
import ar.mbc.backendpf.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository expeRepo;

    @Override
    public List<Experiencia> verExperiencia() {
        return expeRepo.findAll();
    }

    @Override
    public void addExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expeRepo.deleteById(id);
    }
    
}
