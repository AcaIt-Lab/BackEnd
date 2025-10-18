package com.acait.domain.repository;

import com.acait.domain.entity.UserEntity;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

  Optional<UserEntity> findByUserId(Long userId);

}
