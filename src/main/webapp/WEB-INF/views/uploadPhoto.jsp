<%--
  Created by IntelliJ IDEA.
  User: r.ron
  Date: 12/21/2017
  Time: 4:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="com.basicservlet.controller.PhotoController"%>
<%@page import="com.basicservlet.controller.BaseController"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%
        String baseURL = (String) request.getAttribute(BaseController.PARAM_BASE_URL);
        String latestPhotoUpload = (String) request.getAttribute(PhotoController.PARAM_LATESTPHOTO);
    %>
    <title>Upload Photo</title>
    <!-- BOOTSTRAP STYLES-->
    <link href="<%=baseURL%>/css/bootstrap.min.css" rel="stylesheet" />

</head>
<body>
<div class="modal-dialog">
    <div class="modal-content">
        <div class="panel panel-primary" style="margin-bottom: 0px;">
            <div class="panel-heading">
                Form Upload Photo
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="col-md-6">
                        <form role="form" method="POST" action="<%=baseURL%>/uploadimgctlr" enctype="multipart/form-data">
                            <div class="form-group">
                                <label>File input</label>
                                <input type="file" method="POST" accept=".jpg" name="file"/>
                            </div>
                            <div class="form-group">
                                <button type="submit" class="btn btn-primary">Upload</button>
                            </div>
                        </form>
                    </div>
                </div>
                <%if (latestPhotoUpload != null && !"".equals(latestPhotoUpload)) {%>
                <div class="row">
                    <div class="col-md-12">
                        <img src="<%=baseURL%>/img/<%=latestPhotoUpload%>" class="col-md-12"/>
                    </div>
                </div>
                <%}%>

            </div>
        </div>
    </div>
</div>
</body>
</html>
