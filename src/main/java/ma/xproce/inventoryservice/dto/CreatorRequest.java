package ma.xproce.inventoryservice.dto;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CreatorRequest {
    private String name;
    private String email;

}
