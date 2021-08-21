package joao.main.jsr.model;
import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Movement {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
   public class MovementId implements Serializable{
      private long idMovement;
      private long idUser;
   }

     @EmbeddedId
     private MovementId id;
     private LocalDateTime entryDate;
     private LocalDateTime exitDate;
     private BigDecimal periodo;
     private Occurrence occurrence;
     private Calendar calendar;



}
