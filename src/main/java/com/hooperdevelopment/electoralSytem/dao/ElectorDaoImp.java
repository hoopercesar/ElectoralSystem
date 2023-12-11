package com.hooperdevelopment.electoralSytem.dao;

import com.hooperdevelopment.electoralSytem.models.Elector;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
@Transactional
public class ElectorDaoImp implements ElectorDao{

    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Elector> getElector() {
        String query = "FROM Elector";
        return entityManager.createQuery(query).getResultList();
    }
}
