package com.student.table.studentquestiontable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
interface TransactionRepository extends JpaRepository<Transaction, Long> {


}
