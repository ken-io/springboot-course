package io.ken.springboot.course.dao;

import io.ken.springboot.course.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User queryById(int id);

    List<User> queryAll();

    int add(User user);

    int delById(int id);

    int updateById(User user);
}
