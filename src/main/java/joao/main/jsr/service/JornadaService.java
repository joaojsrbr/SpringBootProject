package joao.main.jsr.service;

import joao.main.jsr.model.JornadaTrabalho;
import joao.main.jsr.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JornadaService {


    JornadaRepository jornadaRepository;


    @Autowired
    public JornadaService(JornadaRepository jornadaRepository){
     this.jornadaRepository = jornadaRepository;
    }

     public JornadaTrabalho save(JornadaTrabalho jornadaTrabalho){

        return jornadaRepository.save(jornadaTrabalho);
      
     }


}
