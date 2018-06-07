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
 * Created by User on 07.06.2018.
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "author", schema = "public")
public class Author {

    @Id
    @GeneratedValue(generator = "sqn_author", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sqn_author", sequenceName = "SQN_AUTHOR", allocationSize = 1)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "author")
    private Set<Item> items = new HashSet<>();
}
