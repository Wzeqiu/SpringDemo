<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>开发者周报</title>
    <link rel="stylesheet" type="text/css" href="/static/css/base.css">
    <link rel="stylesheet" type="text/css" href="/static/css/index.css">
    <script type="text/javascript" src="http://apps.bdimg.com/libs/jquery/1.9.1/jquery.min.js"></script>
    <%--<script src="/static/js/jquery-3.1.1.min.js"/>--%>
    <style type="text/css">
        .header {
            width: 100%;
            height: 450px;
            background-image: url("/static/img/8a41f469jw1f6hj0nz2urj21hc0gojsf.jpg")
        }

        .content {
            width: 100%;
            height: 100%;
            background-color: #263238;
            float: left;
            text-align: left;
        }

        .week {
            width: 1125px;
            margin-top: 30px
        }

        .week_title {
            background-color: #FF5722;
            width: 100%;
            height: 30%;
            border-radius: 8px 8px 0 0;
            text-align: center
        }

        .week_title img {
            border-radius: 25px;
            width: 45px;
            height: 45px;
            margin-top: 25px
        }

        .week_title p {
            color: white;
            font-size: 20px;
            margin-top: 20px
        }

        .week_content {
            float: left;
            width: 350px;
            height: 500px;
            margin-left: 25px;
            margin-top: 50px;
        }

        .message {
            background-color: white;
        }

        .page {
            width: 100%;
            height: 400px;
            background-color: crimson;
            float: left;
            margin-top: 20px
        }

        .message a:link, .message a:visited {
            color: #909DB9;
        }

        .message a:hover, .message a:active {
            color: #FF5722;
        }

        .header_tab {
            width: 100%;
            height: 50px;
            color: white;
            padding-top: 20px;
            padding-bottom: 20px;
            margin: 0 auto;
            position: fixed;
            top: 0px;
        }

        .header_tab a {
            color: white;
            font-weight: bold;
            font-size: 22px;
            position: relative;
        }

        .header_tab li {
            float: left;
            width: 166px;
            text-align: center;
            font-size: 22px;
            line-height: 50px
        }

        .header_tab a:before {
            content: "";
            position: absolute;
            left: 50%;
            bottom: -20px;
            width: 0;
            height: 4px;
            background: white;
            transition: all .3s;
        }

        .header_tab a:hover:before {
            width: 100%;
            left: 0;
            right: 0;
        }
    </style>
    <script type="text/javascript">
        /* 导航栏变色 */
        function gdjz() {
            b = $(window).scrollTop();
            console.log(b);
            if (b > 10) {
                $(".header_tab").css("background-color", "white");
                $(".header_tab  a").css("color", "black");
            } else {
                $(".header_tab").css("background-color", "transparent");
                $(".header_tab a").css("color", "white");
            }
        }

        $(document).ready(function (e) {
            $(window).scroll(function () {
                        gdjz();
                    }

                    /*var a,b,c;
                     a=$("#dh").offset().top;//元素相对于窗口的距离
                     b=$(window).scrollTop(); //监控窗口已滚动的距离;
                     c=$(document).height();//整个文档的高度
                     d=$(window).height();//浏览器窗口的高度*/

                    /*if(d+b>a+100){
                     $("#dh").addClass("xz");
                     }
                     */
            );
        });
    </script>

</head>
<body>
<div class="header">
    <div class="header_tab">
        <ul style="width: 996px;margin: 0 auto">
            <li><a href="#">主页</a></li>
            <li><a href="#">工具</a></li>
            <li><a href="#">订阅</a></li>
            <li><a href="#">投稿</a></li>
            <li><a href="#">捐赠</a></li>
            <li><a href="#">关于</a></li>
        </ul>
    </div>
</div>
<div class="content">
    <div class="week">
        <c:forEach items="${itemsList }" var="item">
            <div class="week_content">
                <a href="#">
                    <div class="week_title">
                        <img src=" ${item.headurl}">
                        <p> ${item.nikename}</p>
                    </div>
                        <%-- week_title end --%>

                    <div class="message"
                         style="width: 100%;height:70%;border-radius: 0 0 8px 8px;padding-top: 20px; padding-left: 15px;padding-right:15px;box-sizing:border-box;">

                        <a style="font-size: 18px; "
                           href="#">Android 开发者周报 ISSUE
                            #${item.id}</a>

                        <div style="width: 100%;margin-top: 15px">

                            <img style="width: 20px;height: 20px;float: left;vertical-align: middle"
                                 src="/static/img/shijian.jpg">

                            <p style="float: left;margin-left: 10px;color: #909DB9;">
                                <fmt:formatDate value="${item.time}" pattern="yyyy-MM-dd"/>
                            </p>
                            <img style="width: 20px;height: 20px;float: left;margin-left: 15px;vertical-align: middle"
                                 src="/static/img/pinglun.jpg">
                            <a style="float: left;margin-left: 10px;" href="#">${item.pinglun}条评论 </a>
                            <p style="clear: both"></p>
                        </div>
                        <p style="color: #393939;margin-top:15px;font-size:20px">
                            新闻
                        </p>
                            <%--<c:forEach items="${item.news}" var="itema">--%>
                            <%--<p style="font-size: 18px;margin-top: 15px;text-indent: 20px">1.Android 7.1 CM 14.1正式发布</p>--%>
                            <%--</c:forEach>--%>

                        <div class="content_footer" style="top:160px;position:relative;width: 100%">
                            <a href="#">查看详情</a>
                            <a style="float: right;">
                                <img id="share" style="width: 20px;height: 20px;vertical-align: middle;"
                                     src="/static/img/fenxiang.jpg"></a>

                        </div>
                    </div>
                        <%-- message end--%>
                </a>
            </div><%-- week_content end --%>
        </c:forEach>
    </div>
    <%--week end--%>
    <div class="page">


    </div>
    <%--page end--%>
</div>
<%--content end--%>


</body>
</html>