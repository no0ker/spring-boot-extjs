package com.orcsoft.springbootextjs.controller;

import java.util.Collections;
import java.util.List;

import com.orcsoft.springbootextjs.db.NoteDbInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/notes")
public class MainRestController {
    @Autowired
    NoteDbInterface dbMockService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    List<Note> getAllNotes() {
        return Collections.singletonList(new Note("testName", "testAddress"));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Note getNodeById(@PathVariable Long id) {
        return dbMockService.getNoteById(id);
    }
}
