package com.sunilpoudel.pasteandshare.service;

import com.sunilpoudel.pasteandshare.entity.Pastes;
import com.sunilpoudel.pasteandshare.repo.PastesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class PastesService {
    @Autowired
    private PastesRepo repo;

    public Pastes createPaste(Pastes pastes){
        pastes.setCode(UUID.randomUUID().toString().replace("-", "").substring(0, 6));
        return repo.save(pastes);
    }

    public Pastes getPaste(String code){
        Pastes paste =  repo.findPastesByCode(code)
                .orElseThrow(() -> new RuntimeException("Paste not found"));
        paste.setViews(paste.getViews() + 1);
        repo.save(paste);

        return paste;
    }

}
