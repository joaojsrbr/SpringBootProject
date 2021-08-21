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
public class BankHours {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
   public class BankHoursId implements Serializable{
      private long idBankHoursID;
      private long idMovement;
      private long idUser;
   }

   @EmbeddedId
     private BankHoursId id;
     private LocalDateTime workDate;
     private BigDecimal amountOfHours;
     private BigDecimal balanceHours;

}
