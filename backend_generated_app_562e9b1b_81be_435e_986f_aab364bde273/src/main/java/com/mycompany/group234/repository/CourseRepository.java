package com.mycompany.group234.repository;


import com.mycompany.group234.model.Course;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class CourseRepository extends SimpleJpaRepository<Course, String> {
    private final EntityManager em;
    public CourseRepository(EntityManager em) {
        super(Course.class, em);
        this.em = em;
    }
    @Override
    public List<Course> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"Course\"", Course.class).getResultList();
    }
}