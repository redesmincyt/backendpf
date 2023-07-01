
package ar.mbc.backendpf.controller;

import ar.mbc.backendpf.model.Experiencia;
import ar.mbc.backendpf.service.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IExperienciaService expeServ;
     
    @PostMapping ("/new/experiencia")
    public void addExperiencia (@RequestBody Experiencia exp) {
        expeServ.addExperiencia(exp);
    }
    
    @GetMapping ("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return expeServ.verExperiencia();
    }
    
    @DeleteMapping ("/borrar/{id}")
    public void borrarExperiencia (@PathVariable Long id) {
        expeServ.borrarExperiencia(id);
    }
    
}
