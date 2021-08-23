package joao.main.jsr.service;

import joao.main.jsr.model.CategoriaUsuario;
import joao.main.jsr.repository.CategoriaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaUsuarioService {


    CategoriaUsuarioRepository categoriaUsuarioRepository;

    @Autowired
    public CategoriaUsuarioService(CategoriaUsuarioRepository categoriaUsuarioRepository) {
        this.categoriaUsuarioRepository = categoriaUsuarioRepository;
    }

    public CategoriaUsuario saveCategoriaUsuario(CategoriaUsuario categoriaUsuario){
       return categoriaUsuarioRepository.save(categoriaUsuario);

    }

    public List<CategoriaUsuario> findAll() {
       return  categoriaUsuarioRepository.findAll();
    }

    public Optional<CategoriaUsuario> getById(Long idGUser) {
        return categoriaUsuarioRepository.findById(idGUser);
    }

    public CategoriaUsuario updateCategoriaUsuario(CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioRepository.save(categoriaUsuario);

    }

    public void deleteCategoriaUsuario(Long idGUser) {
        categoriaUsuarioRepository.deleteById(idGUser);
    }
}
