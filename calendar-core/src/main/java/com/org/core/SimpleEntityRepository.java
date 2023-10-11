package com.org.core;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


public interface SimpleEntityRepository extends JpaRepository<SimpleEntity,Long> {
//    private final EntityManager em;
//
//    public List<SimpleEntity> fi  ndAll() {
//        return em.createQuery("select se from SimpleEntity se", SimpleEntity.class)
//                .getResultList();
//    }
//
//    public SimpleEntity save(SimpleEntity se) {
//        em.persist(se);
//        return se;
//    }
}
