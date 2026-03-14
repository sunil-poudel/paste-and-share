package com.sunilpoudel.pasteandshare.repo;

import com.sunilpoudel.pasteandshare.entity.Pastes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PastesRepo extends JpaRepository<Pastes, Long> {
    Optional<Pastes> findPastesByCode(String code);
}
