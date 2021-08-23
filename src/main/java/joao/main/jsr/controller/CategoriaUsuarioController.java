package joao.main.jsr.controller;


import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import joao.main.jsr.model.CategoriaUsuario;
import joao.main.jsr.model.NivelAcesso;
import joao.main.jsr.service.CategoriaUsuarioService;
import joao.main.jsr.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/categoriausuario")
public class CategoriaUsuarioController {
    @Autowired
    CategoriaUsuarioService categoriaUsuarioService;
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Criado com Sucesso"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @PostMapping
    public CategoriaUsuario createCategoriausuario(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.saveCategoriaUsuario(categoriaUsuario);
    }
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Lista retornada com Sucesso"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping
    public List<CategoriaUsuario> getCategoriaUsuarioList(){
        return categoriaUsuarioService.findAll();

    }
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ID retornado com Sucesso"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping("/{idCategoriaUsuario}")
    public ResponseEntity<CategoriaUsuario>  getCategoriaUsuarioByID(@PathVariable("idCategoriaUsuario") Long idGUser) throws Exception {
        return  ResponseEntity.ok(categoriaUsuarioService.getById(idGUser).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Atualização bem sucedida"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @PutMapping
    public CategoriaUsuario updateCategoriaUsuario(@RequestBody CategoriaUsuario categoriaUsuario){
        return categoriaUsuarioService.updateCategoriaUsuario(categoriaUsuario);
    }
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Deletado com Sucesso"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @DeleteMapping("/{idCategoriaUsuario}")
    public ResponseEntity deleteByID(@PathVariable("idCategoriaUsuario") Long idGUser) throws Exception {
        try {
            categoriaUsuarioService.deleteCategoriaUsuario(idGUser);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<CategoriaUsuario>) ResponseEntity.ok();

    }



}
