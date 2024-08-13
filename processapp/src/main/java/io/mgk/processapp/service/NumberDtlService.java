package io.mgk.processapp.service;

import io.mgk.processapp.DTO.NumberDetailsDTO;
import io.mgk.processapp.repository.NumberDtlRepository;
import io.mgk.processapp.transformer.NumberDetailsTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class NumberDtlService {
    @Autowired
    private NumberDtlRepository numberDtlRepository;

    @Autowired
    private NumberDetailsTransformer numberDetailsTransformer;

    public List<NumberDetailsDTO> getAllNumberDtls() {
        return numberDetailsTransformer.transformNumDTOsToNums(numberDtlRepository.findAll());
    }

    public void processAndSaveNum(NumberDetailsDTO numberDetailsDTO) {
        Stream.of(numberDetailsDTO.getNumberList().split(",")).map(String::trim).map(Integer::parseInt)
                .collect(Collectors.partitioningBy(n->n%2==0)).forEach((key, value)->{
            if(key.equals(true)) {
                numberDetailsDTO.setEvenNumberList(value.stream().map(Object::toString).collect(Collectors.joining(",","[","]")));
            }
            if(key.equals(false)) {
                numberDetailsDTO.setOddNumberList(value.stream().map(Object::toString).collect(Collectors.joining(",","[","]")));
            }
        });
        numberDtlRepository.save(numberDetailsTransformer.transformNumToNumDTO(numberDetailsDTO));
    }
}
