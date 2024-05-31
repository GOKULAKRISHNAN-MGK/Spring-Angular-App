package io.mgk.processapp.controller;

import io.mgk.processapp.DTO.NumberDetailsDTO;
import io.mgk.processapp.service.NumberDtlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/number")
public class NumberDtlController {

    @Autowired
    private NumberDtlService numberDtlService;

    @GetMapping("/getNumbers")
    @ResponseStatus(HttpStatus.OK)
    public List<NumberDetailsDTO> getAllNumberDtls() {
        return numberDtlService.getAllNumberDtls();
    }

    @PostMapping("/processNumbers")
    @ResponseStatus(HttpStatus.CREATED)
    public void processAndSaveNumDtls(@RequestBody NumberDetailsDTO numberDetailsDTO) {
        numberDtlService.processAndSaveNum(numberDetailsDTO);
    }
}
