package com.sunilpoudel.pasteandshare.controller;

import com.sunilpoudel.pasteandshare.dto.PasteRequest;
import com.sunilpoudel.pasteandshare.dto.PasteResponse;
import com.sunilpoudel.pasteandshare.entity.Pastes;
import com.sunilpoudel.pasteandshare.service.PastesService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pastes")
public class PastesController {

    private final PastesService service;

    public PastesController(PastesService service) {
        this.service = service;
    }

    @PostMapping
    public PasteResponse createPaste(@RequestBody PasteRequest request) {
        Pastes paste = new Pastes();
        paste.setCode(request.getCode());
        paste.setContent(request.getContent());

        Pastes savedPaste = service.createPaste(paste);

        return new PasteResponse(
                savedPaste.getId(),
                savedPaste.getCode(),
                savedPaste.getContent(),
                savedPaste.getViews(),
                savedPaste.getCreatedAt()
        );
    }

    @GetMapping("/{code}")
    public PasteResponse getPaste(@PathVariable String code) throws Exception {
        Pastes paste = service.getPaste(code);

        return new PasteResponse(
                paste.getId(),
                paste.getCode(),
                paste.getContent(),
                paste.getViews(),
                paste.getCreatedAt()
        );
    }
}