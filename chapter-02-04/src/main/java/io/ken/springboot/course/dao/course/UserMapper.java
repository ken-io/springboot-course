package io.ken.springboot.course.dao.course;

import io.ken.springboot.course.model.course.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface UserMapper {

    User queryById(int id);

    List<User> queryAll();

    int add(User user);

    int delById(int id);

    int updateById(User user);
}
