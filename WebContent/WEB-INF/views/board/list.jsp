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

	<!-- Navbar ================================================== -->
   	<div class="navbar navbar-expand-lg fixed-top navbar-light bg-light">
      <div class="container">
        <a href="https://bootswatch.com/" class="navbar-brand">Blog</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="true" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="navbar-collapse collapse show" id="navbarResponsive" style="">
          <ul class="navbar-nav">
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="https://bootswatch.com/litera/#" id="themes" aria-expanded="false">Themes <span class="caret"></span></a>
              <div class="dropdown-menu" aria-labelledby="themes">
                <a class="dropdown-item" href="https://bootswatch.com/default/">Default</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="https://bootswatch.com/cerulean/">Cerulean</a>
                <a class="dropdown-item" href="https://bootswatch.com/cosmo/">Cosmo</a>
                <a class="dropdown-item" href="https://bootswatch.com/cyborg/">Cyborg</a>
                <a class="dropdown-item" href="https://bootswatch.com/darkly/">Darkly</a>
                <a class="dropdown-item" href="https://bootswatch.com/flatly/">Flatly</a>
                <a class="dropdown-item" href="https://bootswatch.com/journal/">Journal</a>
                <a class="dropdown-item" href="https://bootswatch.com/litera/">Litera</a>
                <a class="dropdown-item" href="https://bootswatch.com/lumen/">Lumen</a>
                <a class="dropdown-item" href="https://bootswatch.com/lux/">Lux</a>
                <a class="dropdown-item" href="https://bootswatch.com/materia/">Materia</a>
                <a class="dropdown-item" href="https://bootswatch.com/minty/">Minty</a>
                <a class="dropdown-item" href="https://bootswatch.com/pulse/">Pulse</a>
                <a class="dropdown-item" href="https://bootswatch.com/sandstone/">Sandstone</a>
                <a class="dropdown-item" href="https://bootswatch.com/simplex/">Simplex</a>
                <a class="dropdown-item" href="https://bootswatch.com/sketchy/">Sketchy</a>
                <a class="dropdown-item" href="https://bootswatch.com/slate/">Slate</a>
                <a class="dropdown-item" href="https://bootswatch.com/solar/">Solar</a>
                <a class="dropdown-item" href="https://bootswatch.com/spacelab/">Spacelab</a>
                <a class="dropdown-item" href="https://bootswatch.com/superhero/">Superhero</a>
                <a class="dropdown-item" href="https://bootswatch.com/united/">United</a>
                <a class="dropdown-item" href="https://bootswatch.com/yeti/">Yeti</a>
              </div>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="https://bootswatch.com/help/">Help</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="https://blog.bootswatch.com/">Blog</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="https://bootswatch.com/litera/#" id="download" aria-expanded="false">Litera <span class="caret"></span></a>
              <div class="dropdown-menu" aria-labelledby="download">
                <a class="dropdown-item" target="_blank" href="https://jsfiddle.net/bootswatch/rnjfzjjo/">Open in JSFiddle</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="https://bootswatch.com/4/litera/bootstrap.min.css" download="">bootstrap.min.css</a>
                <a class="dropdown-item" href="./Bootswatch_ Litera_files/bootstrap.css" download="">bootstrap.css</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="https://bootswatch.com/4/litera/_variables.scss" download="">_variables.scss</a>
                <a class="dropdown-item" href="https://bootswatch.com/4/litera/_bootswatch.scss" download="">_bootswatch.scss</a>
              </div>
            </li>
          </ul>

          <ul class="nav navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link" href="https://wrapbootstrap.com/?ref=bsw" target="_blank">WrapBootstrap</a>
            </li>
          </ul>

        </div>
      </div>
    </div>


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

      <footer id="footer">
        <div class="row">
          <div class="col-lg-12">

            <ul class="list-unstyled">
              <li class="float-lg-right"><a href="https://bootswatch.com/litera/#top">Back to top</a></li>
              <li><a href="https://blog.bootswatch.com/" onclick="pageTracker._link(this.href); return false;">Blog</a></li>
              <li><a href="https://blog.bootswatch.com/rss/">RSS</a></li>
              <li><a href="https://twitter.com/bootswatch">Twitter</a></li>
              <li><a href="https://github.com/thomaspark/bootswatch/">GitHub</a></li>
              <li><a href="https://bootswatch.com/help/#api">API</a></li>
              <li><a href="https://bootswatch.com/help/#donate">Donate</a></li>
            </ul>
            <p>Made by <a href="https://thomaspark.co/">Thomas Park</a>.</p>
            <p>Code released under the <a href="https://github.com/thomaspark/bootswatch/blob/master/LICENSE">MIT License</a>.</p>
            <p>Based on <a href="https://getbootstrap.com/" rel="nofollow">Bootstrap</a>. Icons from <a href="https://fontawesome.com/" rel="nofollow">Font Awesome</a>. Web fonts from <a href="https://fonts.google.com/" rel="nofollow">Google</a>.</p>

          </div>
        </div>

      </footer>
      </div>

	<script src="../../Bootswatch_ Litera_files/jquery.min.js.다운로드"></script>
    <script src="../../Bootswatch_ Litera_files/popper.min.js.다운로드"></script>
    <script src="../../Bootswatch_ Litera_files/bootstrap.min.js.다운로드"></script>
    <script src="../../Bootswatch_ Litera_files/custom.js.다운로드"></script>
</body>
</html>