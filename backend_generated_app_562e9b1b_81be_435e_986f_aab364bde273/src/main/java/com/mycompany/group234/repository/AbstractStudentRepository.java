package com.mycompany.group234.repository;


import com.mycompany.group234.model.AbstractStudent;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class AbstractStudentRepository extends SimpleJpaRepository<AbstractStudent, String> {
    private final EntityManager em;
    public AbstractStudentRepository(EntityManager em) {
        super(AbstractStudent.class, em);
        this.em = em;
    }
    @Override
    public List<AbstractStudent> findAll() {
        return em.createNativeQuery("Select * from \"generated_app\".\"AbstractStudent\"", AbstractStudent.class).getResultList();
    }
}