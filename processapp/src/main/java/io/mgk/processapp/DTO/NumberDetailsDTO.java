package io.mgk.processapp.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NumberDetailsDTO {
    private String numberList;
    private String oddNumberList;
    private String evenNumberList;
}
