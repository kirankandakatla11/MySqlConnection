package com.kiranit.mysqlConnection.repository;

import com.kiranit.mysqlConnection.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<StudentEntity,Integer> {
}
