<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- Tell the browser to be responsive to screen width -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="keywords"
	content="wrappixel, admin dashboard, html css dashboard, web dashboard, bootstrap 5 admin, bootstrap 5, css3 dashboard, bootstrap 5 dashboard, Ample lite admin bootstrap 5 dashboard, frontend, responsive bootstrap 5 admin template, Ample admin lite dashboard bootstrap 5 dashboard template">
<meta name="description"
	content="Ample Admin Lite is powerful and clean admin dashboard template, inpired from Bootstrap Framework">
<meta name="robots" content="noindex,nofollow">
<title>Ample Admin Lite Template by WrapPixel</title>
<link rel="canonical"
	href="https://www.wrappixel.com/templates/ample-admin-lite/" />
<!-- Favicon icon -->
<link rel="icon" type="image/png" sizes="16x16"
	href="/OpenBanking/resources/images/favicon.png">
<!-- Custom CSS -->
<link href="/OpenBanking/resources/css/chartist.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="/OpenBanking/resources/css/chartist-plugin-tooltip.css">
<!-- Custom CSS -->
<link href="/OpenBanking/resources/css/style.min.css" rel="stylesheet">
<link href="/OpenBanking/resources/css/onlyForMe.css" rel="stylesheet">
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
	crossorigin="anonymous">



<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2"
	crossorigin="anonymous"></script>

<!-- FONT -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Libre+Baskerville:ital@1&display=swap"
	rel="stylesheet">


<script>


document.addEventListener("DOMContentLoaded",()=>{
	document.getElementById("click").click();
	document.getElementById("click").style.display = 'none';
	
	const btn1 = document.getElementById("close1");
	const btn2 = document.getElementById("close2");
	
	btn1.addEventListener("click",()=>{
		document.location.href="${pageContext.request.contextPath}/";
	});
	

	btn2.addEventListener("click",()=>{
		document.location.href="${pageContext.request.contextPath}/";
	});
	
		
});


</script>




</head>
<body>


	<jsp:include page="/jsp/include/topAndSide.jsp" />

	<section>



		<!-- Button trigger modal -->
		<div class="d-flex justify-content-center">
			<button type="button" class="btn btn-primary " data-bs-toggle="modal"
				data-bs-target="#exampleModal" id="click">OPENBANKING
				CONSENT FORM</button>
		</div>


		<!-- Modal -->
		<div class="modal fade" id="exampleModal" tabindex="-1"
			aria-labelledby="exampleModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h5 class="modal-title" id="exampleModalLabel">OPENBANKING
							CONSENT FORM</h5>
						<button type="button" class="btn-close" data-bs-dismiss="modal"
							aria-label="Close" id="close1"></button>
					</div>
					<div class="modal-body">

						<div class="accordion accordion-flush" id="accordionFlushExample">
							<div class="accordion-item">
								<h2 class="accordion-header" id="flush-headingOne">
									<button class="accordion-button collapsed" type="button"
										data-bs-toggle="collapse" data-bs-target="#flush-collapseOne"
										aria-expanded="false" aria-controls="flush-collapseOne">
										OPENBANKING CONSENT</button>
								</h2>
								<div id="flush-collapseOne" class="accordion-collapse collapse"
									aria-labelledby="flush-headingOne"
									data-bs-parent="#accordionFlushExample">
									<div class="accordion-body">
										<code>OPENBANKING</code>
									</div>

									<p>If you would like to transfer to another bank,</p>
									<p>please agree to the open banking service</p>


									<form
										action="${pageContext.request.contextPath}/bank/openBankingAgreeProcess.do"
										method="post" name="writeForm" onsubmit="return checkForm()">
										OPENBANKING CONSENT<input type="checkbox" name="consent"
											value="Y" checked>
										<div class="modal-footer">
											<button type="button" class="btn btn-secondary"
												data-bs-dismiss="modal" id="close2">CLOSE</button>
											<button type="submit" class="btn btn-primary">SUBMIT</button>
										</div>
									</form>
								</div>
							</div>
						</div>
					</div>



				</div>
			</div>
		</div>

		<%-- 
     	<form action="${pageContext.request.contextPath}/bank/openBankingAgreeProcess.do" method="post" name="writeForm" onsubmit="return checkForm()">
			OPENBANKING CONSENT<input type="checkbox" name="consent" value="Y" checked>
			
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal" id="close2">CLOSE</button>
        <button type="submit" class="btn btn-primary">SUBMIT</button>
      </div>
    </div>
  	</div>
	</div>
	</form>
	 --%>











	</section>








	<jsp:include page="/jsp/include/footer.jsp" />









	<script src="/OpenBanking/resources/js/jquery.min.js"></script>
	<!-- Bootstrap tether Core JavaScript -->
	<script src="/OpenBanking/resources/js/bootstrap.bundle.min.js"></script>
	<script src="/OpenBanking/resources/js/app-style-switcher.js"></script>
	<script src="/OpenBanking/resources/js/jquery.sparkline.min.js"></script>
	<!--Wave Effects -->
	<script src="/OpenBanking/resources/js/waves.js"></script>
	<!--Menu sidebar -->
	<script src="/OpenBanking/resources/js/sidebarmenu.js"></script>
	<!--Custom JavaScript -->
	<script src="/OpenBanking/resources/js/custom.js"></script>
	<!--This page JavaScript -->
	<!--chartis chart-->
	<script src="/OpenBanking/resources/js/chartist.min.js"></script>
	<script src="/OpenBanking/resources/js/chartist-plugin-tooltip.min.js"></script>
	<script src="/OpenBanking/resources/js/dashboard1.js"></script>




</body>
</html>