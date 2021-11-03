package com.eomcs.pms.domain;

import java.sql.Date;

//한 회원의 데이터를 저장할 수 있도록
//새 구조의 데이터 타입(user defined data type)을 정의한다.
public class Member {
  public int no;
  public String name;
  public String email;
  public String password;
  public String photo;
  public String tel;
  public Date registeredDate;

  public int getNo() {
    return no;
  }
  public String getName() {
    return name;
  }
  public String getEmail() {
    return email;
  }
  public String getPassword() {
    return password;
  }
  public String getPhoto() {
    return photo;
  }
  public String getTel() {
    return tel;
  }
  public Date getRegisteredDate() {
    return registeredDate;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public void setName(String name) {
    this.name = name;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public void setPhoto(String photo) {
    this.photo = photo;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }
  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }


}

