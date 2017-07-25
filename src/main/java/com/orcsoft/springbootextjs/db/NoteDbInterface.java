package com.orcsoft.springbootextjs.db;

import java.util.Collection;

import com.orcsoft.springbootextjs.entity.Note;

public interface NoteDbInterface {
    Long createNote(Note newNote);
    Collection<Note> getAllNotes();
    Note getNoteById(Long id);
}
