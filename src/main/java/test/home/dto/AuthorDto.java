package test.home.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

/**
 * Created by User on 07.06.2018.
 */

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthorDto {

    private Long id;
    private String name;

}
