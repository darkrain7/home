package test.home.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;
import test.home.dto.ItemAndOrderDto;

import javax.persistence.*;

/**
 * Created by User on 17.05.2018.
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "item_and_order", schema = "public")
public class ItemAndOrder {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
