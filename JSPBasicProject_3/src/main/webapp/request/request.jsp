<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.sist.dao.*"
    buffer="16kb" info="상품 목록" errorPage="error.jsp"
%>
<%--
      contentType="text/html; charset=UTF-8"
      import="java.util.*,com.sist.dao.*"
      errorPage="error.jsp"
 --%>
<%
    // 1. 사용자가 요청한 값 => request.getParameter() => page 
    String strPage=request.getParameter("page");
    // 처음 실행시에는 page전송이 불가능 => default 
    /*
        http://localhost/JSPBasicProject_3/request/request.jsp
        => ?가 없는 상태 => null
        ?page=   ""
    */
    if(strPage==null)
    {
    	strPage="1";
    }
    // 현재 페이지 
    int curpage=Integer.parseInt(strPage);
    // 데이터베이스 연동 
    GoodsDAO dao=GoodsDAO.newInstance();
    // 데이터 읽기 
    List<GoodsVO> list=dao.goodsListData(curpage);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
  font-family: sans-serif , Arial;
  padding: 40px;
  background: #f5f5f5;
}
.card-wrap{
   display: flex;
   flex-wrap: wrap;/*  이미지 => 범위를 벗어나면 아래로 내려라 */
   gap:20px;
}
.card {
  width: calc(25% - 15px); /* 한줄에 4개 */
  background: white;
  border-radius: 12px; /* top-left top-right bottom-right bottom-left */
  overflow: hidden;
  text-transform: 0.3s /* 수행시간 3초 */
}
.card:hover{
  transform:translateY(-5px)
}
.card img{
  width: 100%;
  height: 220px;
  object-fit:cover;/* 이미지를 화면 크기에 맞게 꽉채운다 */
  display: block;
}
.card-body {
  padding: 15px;
}
.card-title {
  font-size: 18px;
  font-weight: bold;
  margin-bottom: 10px;
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
}
.card-text {
  color: #666;
  font-size: 14px;
}
</style>
</head>
<body>
  <div class="card-wrap">
   <%
      for(GoodsVO vo:list)
      {
   %>
	    <div class="card">
	      <img src="<%=vo.getGoods_poster() %>">
	      <div class="card-body">
	        <div class="card-title"><%=vo.getGoods_name() %></div>
	        <div class="card-text"><%=vo.getGoods_price() %></div>
	      </div>
	    </div>
   <%
      }
   %>
  </div>
</body>
</html>