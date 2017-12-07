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
	<title>LinkedIn</title>
	<meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="css/font.css">
	<link rel="stylesheet" href="css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="js/xadmin.js"></script>

</head>
<body>
    <!-- é¡¶é¨å¼å§ -->
    <div class="container">
        <div class="logo"><a href="/LinkedIn/Security/index">æè¿ç´è</a></div>
        <div class="left_open">
            <i title="å±å¼å·¦ä¾§æ " class="iconfont">&#xe699;</i>
        </div>
        <ul class="layui-nav right" lay-filter="">
          <li class="layui-nav-item">
            <a href="javascript:;">admin</a>
            <dl class="layui-nav-child"> <!-- äºçº§èå -->
              <dd><a onclick="x_admin_show('ä¸ªäººä¿¡æ¯','http://www.baidu.com')">ä¸ªäººä¿¡æ¯</a></dd>
              <dd><a onclick="x_admin_show('åæ¢å¸å·','http://www.baidu.com')">åæ¢å¸å·</a></dd>
              <dd><a href="/LinkedIn/Security/logout">éåº</a></dd>
            </dl>
          </li>
          <li class="layui-nav-item to-index"><a href="/">åå°é¦é¡µ</a></li>
        </ul>
        
    </div>
    <!-- é¡¶é¨ç»æ -->
    <!-- ä¸­é¨å¼å§ -->
     <!-- å·¦ä¾§èåå¼å§ -->
    <div class="left-nav">
      <div id="side-nav">
        <ul id="nav">
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6b8;</i>
                    <cite>ç¨æ·ç®¡ç</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="User/list">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>ç¨æ·åè¡¨</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="member-del.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>ç¨æ·å é¤</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>å¬å¸ç®¡ç</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="Company/list">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>å¬å¸åè¡¨</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe726;</i>
                    <cite>ç®åç®¡ç</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="User/ulist">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>ç¨æ·åè¡¨</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="admin-role.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>ç®åæ·»å </cite>
                        </a>
                    </li >
                    <li>
                        <a _href="admin-cate.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>ç®åä¿®æ¹</cite>
                        </a>
                    </li >
                    <li>
                        <a _href="admin-rule.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>ç®åå é¤</cite>
                        </a>
                    </li >
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ce;</i>
                    <cite>èä½ç®¡ç</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="Post/list">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>èä½åè¡¨</cite>
                        </a>
                    </li >
                </ul>
            </li>
        </ul>
      </div>
    </div>
    <!-- <div class="x-slide_left"></div> -->
    <!-- å·¦ä¾§èåç»æ -->
    <!-- å³ä¾§ä¸»ä½å¼å§ -->
    <div class="page-content">
        <div class="layui-tab tab" lay-filter="xbs_tab" lay-allowclose="false">
          <ul class="layui-tab-title">
            <li>æçæ¡é¢</li>
          </ul>
          <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='./welcome.html' frameborder="0" scrolling="yes" class="x-iframe"></iframe>
            </div>
          </div>
        </div>
    </div>
    <div class="page-content-bg"></div>
    <!-- å³ä¾§ä¸»ä½ç»æ -->
    <!-- ä¸­é¨ç»æ -->
    <!-- åºé¨å¼å§ -->
    <div class="footer">
        <div class="copyright">Copyright Â©2017 x-admin v2.3 All Rights Reserved</div>  
    </div>
    <!-- åºé¨ç»æ -->
    <script>
    //ç¾åº¦ç»è®¡å¯å»æ
    var _hmt = _hmt || [];
    (function() {
      var hm = document.createElement("script");
      hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
      var s = document.getElementsByTagName("script")[0]; 
      s.parentNode.insertBefore(hm, s);
    })();
    </script>
</body>
</html>