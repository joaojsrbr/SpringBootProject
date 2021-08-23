package joao.main.jsr.repository;


import joao.main.jsr.model.CategoriaUsuario;
import joao.main.jsr.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuario, Long> {



}
