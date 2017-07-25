package com.orcsoft.springbootextjs.service;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.orcsoft.springbootextjs.controller.Note;
import com.orcsoft.springbootextjs.db.NoteDbInterface;
import org.springframework.stereotype.Service;

@Service
public class DBMockService implements NoteDbInterface {
    private Map<Long, Note> data = new ConcurrentHashMap<Long, Note>();

    public DBMockService() {
        initTestData();
    }

    private void initTestData() {
        data.put(1L, new Note("name_1", "address_1"));
        data.put(2L, new Note("name_2", "address_2"));
        data.put(3L, new Note("name_3", "address_3"));
        data.put(4L, new Note("name_4", "address_4"));
    }

    public Note getNoteById(Long id) {
        return data.get(id);
    }

    @Override
    public Collection<Note> getAllNotes() {
        return data.values();
    }
}

