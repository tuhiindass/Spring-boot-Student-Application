package com.student.table.studentquestiontable;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long>{

	 @Query("select u from Session u where u.id=:n")
     public List<Session> getSession(@Param("n") Long id);
}
