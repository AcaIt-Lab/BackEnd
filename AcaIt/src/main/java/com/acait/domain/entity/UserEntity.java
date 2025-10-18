package com.acait.domain.entity;

import com.acait.domain.type.UserRoleType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "user")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;

  @Column(nullable = false)
  private String provider;

  @Column(nullable = false)
  private String providerId;

  @Column(nullable = false)
  private String providerEmail;

  @Enumerated(EnumType.STRING)
  private UserRoleType userRoleType;

  private String userName;

  private String userEmail;

  private String organization;

  private String subjects;

  private String contact;

  private String personalHistory;

  @Column(nullable = false)
  private LocalDateTime createAt;

  private LocalDateTime lastLoginAt;

  private LocalDateTime deleteAt;

}
