package com.walleto.model.entity;

import com.walleto.webconfig.TokenType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Document(collection = "Tokens")
public class Token {
 @Transient
 public static final String SEQUENCE_TOKEN="user_sequence";

   @Id
    public Integer id;


    public String token;


    public TokenType tokenType = TokenType.BEARER;

    public boolean revoked;

    public boolean expired;


    public User user;

 public Integer getId() {
  return id;
 }

 public void setId(Integer id) {
  this.id = id;
 }

 public String getToken() {
  return token;
 }

 public void setToken(String token) {
  this.token = token;
 }

 public TokenType getTokenType() {
  return tokenType;
 }

 public void setTokenType(TokenType tokenType) {
  this.tokenType = tokenType;
 }

 public boolean isRevoked() {
  return revoked;
 }

 public void setRevoked(boolean revoked) {
  this.revoked = revoked;
 }

 public boolean isExpired() {
  return expired;
 }

 public void setExpired(boolean expired) {
  this.expired = expired;
 }

 public User getUser() {
  return user;
 }

 public void setUser(User user) {
  this.user = user;
 }
}