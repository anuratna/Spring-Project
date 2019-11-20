function validate() {
	var userName = document.getElementById("userName").value;
	var password = document.getElementById("password").value;
	if (userName == '') {
		alert('Please enter a valid User Name');
		return false;
	} 
	else if (password == '') {
		alert('Please enter a valid Password');
		return false;
	} 
	else {
		return true;
	}
}