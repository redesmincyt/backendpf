
package ar.mbc.backendpf.controller;

import ar.mbc.backendpf.model.Experiencia;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    List<Experiencia> listaExp = new ArrayList();
    
    @PostMapping ("/new/experiencia")
    public void addExperiencia (@RequestBody Experiencia exp) {
        listaExp.add(exp);
    }
    
    @GetMapping ("/ver/Experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return listaExp;
    }
    
}
