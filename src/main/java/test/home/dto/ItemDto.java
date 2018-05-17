package test.home.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

/**
 * Created by User on 17.05.2018.
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemDto {

    private Long id;

    private String name;

    private Long price;
}
