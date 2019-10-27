<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link rel="stylesheet" href="../../Bootswatch_ Litera_files/bootstrap.css" media="screen">
<link rel="stylesheet" href="../../Bootswatch_ Litera_files/custom.min.css">
<script type="text/javascript" async="" src="../../Bootswatch_ Litera_files/ga.js.다운로드"></script>
<title>board read</title>
<style type="text/css">
.buttons a {
	text-decoration: none;
}
.regdate {
	float: right;
}
</style>
</head>
<body>
	<jsp:include page="../include/header.jsp"/>
	<div class="container">
		<div class="card border-secondary">
			<h3 class="card-header">${board.title}</h3>
		    <div class="list-group list-group-flush">
		    	<p class="list-group-item">
		    		<span class="writer">${board.writer}</span>
		    		<span class="regdate">${board.regdate}</span>
		    	</p>
		    </div>
		    <div class="card-body">
			<p class="card-text">${board.content}</p>
			</div>
		</div>
		<div class="buttons" style="margin-top: 20px; text-align: right;">
		<a href="/board/list?page=${param.page}&amount=${param.amount}">
			<button type="button" class="btn btn-outline-primary">
			수정
			</button>
		</a>
		<a href="/board/list?page=${param.page}&amount=${param.amount}">
			<button type="button" class="btn btn-outline-primary">
			삭제
			</button>
		</a>
		<a href="/board/list?page=${param.page}&amount=${param.amount}">
			<button type="button" class="btn btn-primary">
			목록가기
			</button>
		</a>
		</div>

	<jsp:include page="../include/footer.jsp"/>
   	</div>

	<script src="../../Bootswatch_ Litera_files/jquery.min.js.다운로드"></script>
    <script src="../../Bootswatch_ Litera_files/popper.min.js.다운로드"></script>
    <script src="../../Bootswatch_ Litera_files/bootstrap.min.js.다운로드"></script>
    <script src="../../Bootswatch_ Litera_files/custom.js.다운로드"></script>
</body>
</html>