package com.sist.dao;
// => 반드시 싱글턴 사용 => new 
/*
 *    jsp 한개당 => _jspService(request,response)를 따로 가지고 있다 
 *                           ------------------- 톰캣에 의해 값이 채워진다 
 *    => 호출마다 request/response가 달라진다 => 초기화
 */
import java.util.*;
import java.sql.*;
public class GoodsDAO {
   private Connection conn;
   private PreparedStatement ps;
   private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
   private static GoodsDAO dao;
   
   // 드라이버 등록 
   // 연결 
   // 닫기 
   // 싱글턴 생성 => new를 사용하지 않고 재사용이 가능 => 메모리 절약 
}
