package com.sist.dao;
/*
 *  NO      NOT NULL NUMBER         
	NAME    NOT NULL VARCHAR2(51)   
	SUBJECT NOT NULL VARCHAR2(2000) 
	CONTENT NOT NULL CLOB           
	PWD     NOT NULL VARCHAR2(10)   
	REGDATE          DATE           
	HIT              NUMBER    
	
	한개의 게시물 정보를 저장할 목적 => 사용자 요청 => 한번에 전송 
	
	매칭 
	   오라클         자바                       MySQL/MariaDB
	   CHAR                                   
	   VARCHAR2                                VARCHAR
	   CLOB         String                     TEXT
	   
	   NUMBER       int                        int
	   NUMBER(2,1)  double                     double
	   
	   DATE         java.util.Date             DATETIME
	   ---------------------------             LocalDateTime
	         => 데이터형 / 내장 함수 
	         => SQL => 표준화 
	         => 문법 / 흐름 (순서) => 모든 언어 사용이 가능 
 */
import java.util.*;
// 읽기 (getter) / 쓰기 (setter)

public class BoardVO {
   private int no,hit;
   private String name,subject,content,pwd,dbday;
   private Date regdate;
   public int getNo() {
	return no;
   }
   public void setNo(int no) {
	this.no = no;
   }
   public int getHit() {
	return hit;
   }
   public void setHit(int hit) {
	this.hit = hit;
   }
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public String getSubject() {
	return subject;
   }
   public void setSubject(String subject) {
	this.subject = subject;
   }
   public String getContent() {
	return content;
   }
   public void setContent(String content) {
	this.content = content;
   }
   public String getPwd() {
	return pwd;
   }
   public void setPwd(String pwd) {
	this.pwd = pwd;
   }
   public String getDbday() {
	return dbday;
   }
   public void setDbday(String dbday) {
	this.dbday = dbday;
   }
   public Date getRegdate() {
	return regdate;
   }
   public void setRegdate(Date regdate) {
	this.regdate = regdate;
   }
   
}







