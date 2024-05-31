package io.mgk.processapp.repository;

import io.mgk.processapp.model.NumberDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberDtlRepository extends JpaRepository<NumberDetails, Long> {
}
