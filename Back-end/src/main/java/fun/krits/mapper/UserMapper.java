package fun.krits.mapper;

import fun.krits.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectById(Integer id);
}