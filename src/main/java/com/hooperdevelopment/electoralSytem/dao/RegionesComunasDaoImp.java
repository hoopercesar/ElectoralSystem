package com.hooperdevelopment.electoralSytem.dao;

import com.hooperdevelopment.electoralSytem.models.RegionesComunas;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class RegionesComunasDaoImp implements RegionesComunasDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<RegionesComunas> getRegionesComunas() {
        String query = "FROM RegionesComunas";

        return entityManager.createQuery(query, RegionesComunas.class).getResultList();
    }
}
