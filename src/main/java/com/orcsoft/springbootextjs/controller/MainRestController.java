package com.orcsoft.springbootextjs.controller;

import java.util.Collection;

import com.orcsoft.springbootextjs.db.NoteDbInterface;
import com.orcsoft.springbootextjs.entity.ErrorCode;
import com.orcsoft.springbootextjs.entity.Message;
import com.orcsoft.springbootextjs.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rest/notes")
public class MainRestController {
    @Autowired
    private NoteDbInterface dbMockService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Collection<Note> getAllNotes() {
        return dbMockService.getAllNotes();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Message create(@RequestBody Note newNote){

        Long id = dbMockService.createNote(newNote);
        if(id != null){
            return new Message(ErrorCode.DB_CREATE_OK, id);
        } else {
            return new Message(ErrorCode.DB_CREATE_FAILED, newNote.toString());
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Note getNodeById(@PathVariable Long id) {
        return dbMockService.getNoteById(id);
    }
}
