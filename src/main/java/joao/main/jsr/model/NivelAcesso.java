package joao.main.jsr.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class NivelAcesso {
    @Id
    @GeneratedValue
    @ApiModelProperty(value = "ID")
    private long id;
    @ApiModelProperty(value = "nível do acesso que o usuário tem")
    private String descricao;
}
