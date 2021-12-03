package com.student.table.studentquestiontable;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {

	Optional<Score> findByProfileId(Long id);

}
