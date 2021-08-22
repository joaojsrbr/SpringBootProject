package joao.main.jsr.controller;


import joao.main.jsr.model.JornadaTrabalho;
import joao.main.jsr.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;


    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){

    return jornadaService.save(jornadaTrabalho);



    }
}
