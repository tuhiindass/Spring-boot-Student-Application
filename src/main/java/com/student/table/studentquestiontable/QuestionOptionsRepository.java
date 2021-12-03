package com.student.table.studentquestiontable;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionOptionsRepository extends JpaRepository<QuestionOptions,Long> {
           
	     //  @Query("select u from QuestionOptions u where u.QsOpid=:n")
           //public List<QuestionOptions> getQuOpDetails(@Param("n") Long QsOpid );

	 @Query("select u from QuestionOptions u")
     public List<QuestionOptions> getQuestionOption();
}
