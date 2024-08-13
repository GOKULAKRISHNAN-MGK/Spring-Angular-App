package io.mgk.processapp.transformer;

import io.mgk.processapp.DTO.NumberDetailsDTO;
import io.mgk.processapp.model.NumberDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class NumberDetailsTransformer {
    public List<NumberDetailsDTO> transformNumDTOsToNums(List<NumberDetails> numDtls) {
        List<NumberDetailsDTO> numberDetailsDTOS = new ArrayList<>();
        numDtls.forEach(num->{
            NumberDetailsDTO numberDetailsDTO = new NumberDetailsDTO();
            numberDetailsDTO.setNumberList(num.getNumberList());
            numberDetailsDTO.setOddNumberList(num.getOddNumberList());
            numberDetailsDTO.setEvenNumberList(num.getEvenNumberList());
            numberDetailsDTOS.add(numberDetailsDTO);
        });
        return numberDetailsDTOS;
    }

    public NumberDetails transformNumToNumDTO(NumberDetailsDTO numberDetailsDTO) {
        NumberDetails numberDetails = new NumberDetails();
        numberDetails.setNumberList(Arrays.stream(numberDetailsDTO.getNumberList().split(",")).map(String::trim).collect(Collectors.joining(",")));
        numberDetails.setOddNumberList(numberDetailsDTO.getOddNumberList());
        numberDetails.setEvenNumberList(numberDetailsDTO.getEvenNumberList());
        return numberDetails;
    }
}
