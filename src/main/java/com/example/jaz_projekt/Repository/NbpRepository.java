package com.example.jaz_projekt.Repository;

import com.example.jaz_projekt.Models.LogRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NbpRepository extends JpaRepository<LogRecord, Long> {


}
