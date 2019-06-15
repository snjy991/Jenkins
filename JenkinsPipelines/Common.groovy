def testMethod(){
	println("Hey I am here");
	withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId:'ANYPOINT', usernameVariable: 'Username', passwordVariable: 'Password']]) {
		println(Username);	
	}	
}
return this
