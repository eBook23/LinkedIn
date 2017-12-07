<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>简历列表</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="css/font.css">
    <link rel="stylesheet" href="css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="js/xadmin.js"></script>
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
  <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">演示</a>
        <a>
          <cite>导航元素</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
    <c:forEach var="r" items="${resumes }" begin="0" end="0">
      <div class="layui-row">
        <form class="layui-form layui-col-md12 x-so" action="Resume/list?userid=${r.userid }">
          <input type="text" name="cname"  placeholder="输入姓名" autocomplete="off" class="layui-input">
          <button  class="layui-btn" lay-filter="add" onclick="sub()"><i class="layui-icon">&#xe615;</i></button>
        </form>
      </div>
      <xblock>
      	<a href="Resume/toadd?userid=${r.userid}"><button class="layui-btn"><i class="layui-icon"></i>添加</button></a>
        <span class="x-right" style="line-height:40px">共${resumes.size()}条数据</span>
      </xblock>
      </c:forEach>
      <table class="layui-table">
        <thead>
          <tr>
            <th>姓名</th>
            <th>性别</th>
            <th>出生年月</th>
            <th>民族</th>
            <th>专业</th>
            <th>邮箱</th>
            <th>操作</th></tr>
        </thead>
        <tbody>
        	<c:forEach var="r" items="${resumes}">
          	<tr>
	            <td>${r.rname}</td>
	            <td>${r.sex}</td>
	            <td>${r.birthday}</td>
	            <td>${r.nation}</td>
	            <td>${r.major}</td>
	            <td>${r.email}</td>
	            <td class="td-manage">
	            	&nbsp&nbsp
	              <a title="修改" href="Resume/get?rno=${r.UUID}">
	                <i class="layui-icon">&#xe642;修改</i>
	              </a>&nbsp&nbsp&nbsp
	              <a title="删除" href="Resume/remove?rno=${r.UUID}">
	                <i class="layui-icon">&#xe640;删除</i>
	              </a>
	            </td>
          	</tr>
          </c:forEach>
        </tbody>
      </table>
      <div class="page">
        <div>
          <a class="prev" href="">&lt;&lt;</a>
          <a class="num" href="">1</a>
          <span class="current">2</span>
          <a class="num" href="">3</a>
          <a class="num" href="">489</a>
          <a class="next" href="">&gt;&gt;</a>
        </div>
      </div>
    </div>
</body>
</html>