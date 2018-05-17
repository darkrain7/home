package test.home.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Builder;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by User on 17.05.2018.
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "order", schema = "public")
public class Order {

    @Id
    @GeneratedValue(generator = "sqn_order", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sqn_order", sequenceName = "SQN_ORDER", allocationSize = 1)
    private Long id;

    @Column(name = "total_sum")
    private Long totalSum;

    @OneToMany(mappedBy = "order")
    Set<ItemAndOrder> itemAndOrders = new HashSet<>();

}
