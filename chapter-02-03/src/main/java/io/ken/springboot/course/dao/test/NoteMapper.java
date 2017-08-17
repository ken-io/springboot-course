package io.ken.springboot.course.dao.test;

import io.ken.springboot.course.model.test.Note;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NoteMapper {

    @Select("SELECT * FROM note")
    List<Note> queryAll();
}
