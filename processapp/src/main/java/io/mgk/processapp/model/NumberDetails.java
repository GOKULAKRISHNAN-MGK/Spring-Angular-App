package io.mgk.processapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="number_dtls")
@AllArgsConstructor
@NoArgsConstructor
public class NumberDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numberList;
    private String oddNumberList;
    private String evenNumberList;
}
