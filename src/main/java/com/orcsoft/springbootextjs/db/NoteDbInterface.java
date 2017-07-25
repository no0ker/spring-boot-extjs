package com.orcsoft.springbootextjs.db;

import com.orcsoft.springbootextjs.controller.Note;

public interface NoteDbInterface {
    public Note getNoteById(Long id);
}
