

<link href="../res/lecheng/css/admin.css" rel="stylesheet" type="text/css"/>
<link href="../res/common/css/theme.css" rel="stylesheet" type="text/css"/>
<link href="../res/common/css/jquery.validate.css" rel="stylesheet" type="text/css"/>
<link href="../res/common/css/jquery.treeview.css" rel="stylesheet" type="text/css"/>
<link href="../res/common/css/jquery.ui.css" rel="stylesheet" type="text/css"/>

<!-- <script src="/thirdparty/ckeditor/ckeditor.js" type="text/javascript"></script> -->
<!-- <script src="/thirdparty/My97DatePicker/WdatePicker.js" type="text/javascript"></script> -->
<script type="text/javascript" src="../res/fckeditor/fckeditor.js"></script>
<script src="../res/common/js/jquery.js" type="text/javascript"></script>
<script src="../res/common/js/jquery.ext.js" type="text/javascript"></script>
<script src="../res/common/js/jquery.form.js" type="text/javascript"></script>
<script src="../res/common/js/lecheng.js" type="text/javascript"></script>
<script src="../res/lecheng/js/admin.js" type="text/javascript"></script>

<link rel="stylesheet" href="../res/css/style.css" />






<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>babasport-list</title>
</head>
<body>
<div class="box-positon">
    <div class="rpos">当前位置: 订单管理 - 列表</div>
    <div class="clear"></div>
</div>
<div class="body-box">
    <input type="hidden" name="pageNo" value=""/>
    <form method="post" id="tableForm">
        <input type="hidden" value="" name="pageNo"/>
        <input type="hidden" value="" name="queryName"/>
        <table cellspacing="1" cellpadding="0" border="0" width="100%" class="pn-ltable">
            <thead class="pn-lthead">
            <tr>

                <th>学生id</th>
                <th>学生姓名</th>
                <th>学生pass</th>
            </tr>
            </thead>
            <tbody class="pn-ltbody">
            <#list users as user>
            <tr bgcolor="#ffffff" onmouseover="this.bgColor='#eeeeee'" onmouseout="this.bgColor='#ffffff'">
                <td >${user.u_id}</td>
                <td >${user.uname}</td>
			    <td >${user.age}</td>
                <a href="" class="pn-opt">查看</a>
                </td>
            </tr>
            </#list>
            </tbody>
        </table>
        <div style="margin-top:15px;">
            <!-- 	<input class="del-button" type="button" value="取消" onclick="optCancel();"/>
                <input class="submit" type="button" value="通过" onclick="optPass();"/> -->
        </div>
    </form>
</div>
</body>
</html>