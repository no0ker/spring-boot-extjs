package com.orcsoft.springbootextjs.service;

import com.orcsoft.springbootextjs.controller.Note;
import com.orcsoft.springbootextjs.db.NoteDbInterface;
import org.springframework.stereotype.Service;

@Service
public class DBMockService implements NoteDbInterface {
    public DBMockService() {
    }

    public Note getNoteById(Long id) {
        return new Note("id:" + id, "addddressss");
    }
}

