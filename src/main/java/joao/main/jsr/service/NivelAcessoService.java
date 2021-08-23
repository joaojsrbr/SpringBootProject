package joao.main.jsr.service;

import joao.main.jsr.model.NivelAcesso;
import joao.main.jsr.model.Usuario;
import joao.main.jsr.repository.NivelAcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NivelAcessoService {


    NivelAcessoRepository nivelAcessoRepository;

    @Autowired
    public NivelAcessoService(NivelAcessoRepository nivelAcessoRepository) {
        this.nivelAcessoRepository = nivelAcessoRepository;
    }

    public NivelAcesso saveNivelAcesso(NivelAcesso nivelAcesso){
       return nivelAcessoRepository.save(nivelAcesso);

    }

    public List<NivelAcesso> findAll() {
       return  nivelAcessoRepository.findAll();
    }

    public Optional<NivelAcesso> getById(Long idNivel) {
        return nivelAcessoRepository.findById(idNivel);
    }

    public NivelAcesso updateNivelAcesso(NivelAcesso nivelAcesso){
        return nivelAcessoRepository.save(nivelAcesso);

    }

    public void deleteNivelAcesso(Long idNivel) {
        nivelAcessoRepository.deleteById(idNivel);
    }
}
