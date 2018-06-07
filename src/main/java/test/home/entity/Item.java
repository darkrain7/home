package test.home.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Builder;

import javax.persistence.*;

/**
 * Created by User on 17.05.2018.
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "item", schema = "public")
public class Item {

    @Id
    @GeneratedValue(generator = "sqn_item", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sqn_item", sequenceName = "SQN_ITEM", allocationSize = 1)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "genre")
    private String genre;

    @Column(name = "title_img")
    private String titleImg;

    @Column(name = "rating")
    private double rating;

    @Column(name = "count_voice")
    private Long countVoice;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

}
