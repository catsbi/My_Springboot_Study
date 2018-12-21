/*(function() {
	var btn = document.getElementsByClassName("btn");
	var myform = document.getElementById("myForm");
	btn.addEventListener('click', regEvent, false);

	function regEvent() {
		var btnName = btn.getAttribute("name");
		console.log(btnName);
		if (btnName == "inputBtn") {
			myform.action = "input";
		} else if (btnName == "deleteBtn") {
			myform.action = "delete";
		} else {
			myform.action = "update";
		}
		myform.submit();
	}
})();*/
$(document).ready(function() {
	var form=$("#myForm");
	$("#deleteBtn,#inputBtn,#updateBtn").on("click", function() {
		var btnName=$(this).val();
		var form=document.getElementsByTagName("form").myForm;
		if (btnName === "Input") {
			form.action = "input";
		} else if (btnName === "Delete") {
			form.action= "delete";
		} else if (btnName === "Update") {
			form.action = "update";
		}
		form.submit();
	})

});