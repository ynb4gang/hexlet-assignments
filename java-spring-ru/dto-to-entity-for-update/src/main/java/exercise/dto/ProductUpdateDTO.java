package exercise.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

// BEGIN
@Getter
@Setter
public class ProductUpdateDTO {

    private String title;

    private int price;
}
// END
