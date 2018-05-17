package test.home.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

import javax.persistence.JoinColumn;

/**
 * Created by User on 17.05.2018.
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemAndOrderDto {

    private Long item_id;

    private Long order_id;

}
