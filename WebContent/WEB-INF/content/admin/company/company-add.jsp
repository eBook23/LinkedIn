<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
  	<base href="<%=basePath%>">
    <meta charset="UTF-8">
    <title>添加公司</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="css/font.css">
    <link rel="stylesheet" href="css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  
  <body>
  
    <div class="x-body">
        <form class="layui-form" action="Company/add" id="myForm">
        	<div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>公司ID
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_email" disabled="disabled" name="cno" required="" lay-verify="email"
                  autocomplete="off" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>公司ID,唯一
              </div>
          	</div>
        
        	<div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>公司名称
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_email" name="cname" required="" lay-verify="email"
                  autocomplete="off" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>公司名称唯一
              </div>
          	</div>
   			<div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  	总经理
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_pass" name="manager" required="" lay-verify="pass"
                  autocomplete="off" class="layui-input">
              </div>
          	</div>
          	<div class="layui-form-item">
              <label for="L_email" class="layui-form-label">
                  <span class="x-red">*</span>公司所在城市
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_email" name="position" required="" lay-verify="email"
                  autocomplete="off" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux">
                  <span class="x-red">*</span>主公司所在城市
              </div>
          	</div>
          	<div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
                  	前台电话
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_repass" name="phone" required="" lay-verify="repass"
                  autocomplete="off" class="layui-input">
              </div>
          	</div>
          	<div class="layui-form-item">
              <label for="L_pass" class="layui-form-label">
                  <span class="x-red">*</span>注册时间
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_pass" name="time" required="" lay-verify="pass"
                  autocomplete="off" class="layui-input">
              </div>
              <div class="layui-form-mid layui-word-aux">
                 
              </div>
          	</div>
          	<div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
                  <span class="x-red"></span>在职员工
              </label>
              <div class="layui-input-inline">
                  <input type="text" id="L_repass" name="countpeople" required="" lay-verify="repass"
                  autocomplete="off" class="layui-input">
              </div>
          	</div>
          	
          	<div class="layui-form-item">
              <label for="L_repass" class="layui-form-label">
              </label>
              <button  class="layui-btn" lay-filter="add" onclick="sub()">
                  添加
              </button>
          </div>
      </form>
    </div>
  </body>
</html>