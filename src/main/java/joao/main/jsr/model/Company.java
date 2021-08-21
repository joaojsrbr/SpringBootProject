package joao.main.jsr.model;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Company {
    private long id;
    private String descricao;
    private String cnpj;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;



}
