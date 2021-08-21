package joao.main.jsr.model;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Calendar {
    private Long id;
    private DateType dateType;
    private String descricao;
    private LocalDateTime especialDate;





}
