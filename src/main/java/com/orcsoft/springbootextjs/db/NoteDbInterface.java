package com.orcsoft.springbootextjs.db;

import java.util.Collection;

import com.orcsoft.springbootextjs.controller.Note;

public interface NoteDbInterface {
    Note getNoteById(Long id);
    Collection<Note> getAllNotes();
}
