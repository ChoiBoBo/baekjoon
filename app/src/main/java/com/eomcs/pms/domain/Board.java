package com.eomcs.pms.domain;

import java.sql.Date;

public class Board {
  public int no;
  public String title;
  public String content;
  public String writer;
  public Date registeredDate;
  public int viewCount;
  public int like;


  public int getNo() {
    return no;
  }
  public String getTitle() {
    return title;
  }
  public String getContent() {
    return content;
  }
  public String getWriter() {
    return writer;
  }
  public Date getRegisteredDate() {
    return registeredDate;
  }
  public int getViewCount() {
    return viewCount;
  }
  public int getLike() {
    return like;
  }
  public void setNo(int no) {
    this.no = no;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public void setWriter(String writer) {
    this.writer = writer;
  }
  public void setRegisteredDate(Date registeredDate) {
    this.registeredDate = registeredDate;
  }
  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }
  public void setLike(int like) {
    this.like = like;
  }




}
