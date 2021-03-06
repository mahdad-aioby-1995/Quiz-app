package com.team3d.quiz.quizapp.repositories.Person;

import com.team3d.quiz.quizapp.entities.Person;
import com.team3d.quiz.quizapp.entities.Student;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long>, JpaSpecificationExecutor<Person> {




}
