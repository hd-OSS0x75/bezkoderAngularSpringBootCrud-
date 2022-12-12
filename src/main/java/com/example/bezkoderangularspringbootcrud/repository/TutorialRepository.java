package com.example.bezkoderangularspringbootcrud.repository;

import com.example.bezkoderangularspringbootcrud.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);
    List<Tutorial> findByTitleContaining(String title);

//    We can also use JpaRepository’s methods: save(), findOne(), findById(), findAll(), count(),
//    delete(), deleteById()… without implementing these methods !
}
