package io.ken.springboot.course.dao.test;

import io.ken.springboot.course.model.test.Note;

import java.util.List;

public interface NoteMapper {

    List<Note> queryAll();
}
