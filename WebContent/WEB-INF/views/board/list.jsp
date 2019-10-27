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
<title>게시물 리스트 조회</title>
<style type="text/css">
.page-align {
	width: 100%;
	text-align: center;
	margin-top: 30px;
}
.page-align div {
	display: inline-block;
	margin-left: auto;
	margin-right: auto;
}
.title {
	width: 40%;
}
</style>
</head>
<body>

	<jsp:include page="../include/header.jsp"/>

	<div class="container">
	<!-- Tables ================================================== -->
	<div class="page-header">
		<h1 id="tables">Board List</h1>
	</div>
	<div class="bs-docs-section">
        <div class="row">
          <div class="col-lg-12">

            <div class="">
              <table class="table table-hover">
                <thead>
                  <tr>
                    <th scope="col">번호</th>
                    <th scope="col" class="title">제목</th>
                    <th scope="col">작성자</th>
                    <th scope="col">작성일</th>
                  </tr>
                </thead>
                <tbody>
                <c:forEach items="${list}" var="board">
                <tr>
	                <th scope="row">${board.bno}</th>
	                <td class="title">
	                <a href="/board/read?bno=${board.bno}&page=&amount=">
	                ${board.title}
	                </a>
	                </td>
	                <td>${board.writer}</td>
	            	<td>${board.regdate}</td>
                </tr>
				</c:forEach>
                </tbody>
              </table>
            </div><!-- /example -->
          </div>
        </div>
     </div>
   	 <div class="page-align">
     <div>
       <ul class="pagination">
			<li class="page-item disabled">
				<a class="page-link" href="https://bootswatch.com/litera/#">«</a>
			</li>
			<li class="page-item active">
				<a class="page-link" href="https://bootswatch.com/litera/#">1</a>
			</li>
			<li class="page-item">
				<a class="page-link" href="https://bootswatch.com/litera/#">2</a>
			</li>
			<li class="page-item">
				<a class="page-link" href="https://bootswatch.com/litera/#">»</a>
			</li>
        </ul>
   	</div>
  	</div>

  	<jsp:include page="../include/footer.jsp"/>


      </div>

	<script src="../../Bootswatch_ Litera_files/jquery.min.js.다운로드"></script>
    <script src="../../Bootswatch_ Litera_files/popper.min.js.다운로드"></script>
    <script src="../../Bootswatch_ Litera_files/bootstrap.min.js.다운로드"></script>
    <script src="../../Bootswatch_ Litera_files/custom.js.다운로드"></script>
</body>
</html>