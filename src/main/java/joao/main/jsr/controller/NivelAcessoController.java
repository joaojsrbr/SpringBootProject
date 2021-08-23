package joao.main.jsr.controller;


import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import joao.main.jsr.model.NivelAcesso;
import joao.main.jsr.service.NivelAcessoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/nivelacesso")
public class NivelAcessoController {
    @Autowired
    NivelAcessoService nivelAcessoService;
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Criado com Sucesso"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @PostMapping
    public NivelAcesso createNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.saveNivelAcesso(nivelAcesso);
    }
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Lista retornada com Sucesso"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping
    public List<NivelAcesso> getNivelAcessoList(){
        return nivelAcessoService.findAll();

    }
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ID retornado com Sucesso"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping("/{idNivelAcesso}")
    public ResponseEntity<NivelAcesso>  getNivelAcessoByID(@PathVariable("idNivelAcesso") Long idNivel) throws Exception {
        return  ResponseEntity.ok(nivelAcessoService.getById(idNivel).orElseThrow(() -> new NoSuchElementException("Not found!")));

    }
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Atualização bem sucedida"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @PutMapping
    public NivelAcesso updateNivelAcesso(@RequestBody NivelAcesso nivelAcesso){
        return nivelAcessoService.updateNivelAcesso(nivelAcesso);
    }
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Deletado com Sucesso"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @DeleteMapping("/{idNivelAcesso}")
    public ResponseEntity deleteByID(@PathVariable("idNivelAcesso") Long idNivel) throws Exception {
        try {
            nivelAcessoService.deleteNivelAcesso(idNivel);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<NivelAcesso>) ResponseEntity.ok();

    }



}
