package com.acait.auth.service;


import com.acait.domain.entity.UserEntity;
import com.acait.domain.repository.UserRepository;
import com.acait.domain.type.FailedResultType;
import com.acait.exception.GlobalException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomUserDetailService implements UserDetailsService {

  private final UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
    UserEntity user = userRepository.findByUserId(Long.parseLong(userId))
        .orElseThrow(() -> new GlobalException(FailedResultType.USER_NOT_FOUND));

    return org.springframework.security.core.userdetails.User.builder()
        .username(user.getProviderEmail())
        .password("")
        .roles(user.getUserRoleType().toString())
        .build();
  }
}
