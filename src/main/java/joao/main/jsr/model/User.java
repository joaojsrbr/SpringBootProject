package joao.main.jsr.model;
import lombok.*;


import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class User {
    private long id;
    @ManyToOne
    private UserCategory userCategory;
    private String nome;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private WorkDay workDay;
    private BigDecimal tolerancia;
    private LocalDateTime Journeystart;
    private LocalDateTime Journeyend;



}
