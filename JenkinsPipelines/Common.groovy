def testMethod(){
	def brachname=GIT_BRANCH;
	def tokens=brachname.tokenize("/");
	println(tokens[1]);		
}
return this
