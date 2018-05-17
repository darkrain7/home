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
    @GeneratedValue(generator = "sqn_item_and_order", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sqn_item_and_order", sequenceName = "SQN_ITEM_AND_ORDER", allocationSize = 1)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
