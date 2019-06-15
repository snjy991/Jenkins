def deployToCloudHub(String JarName){
	
	String PATH= "/devops/out/CDScript/working/"+JarName
	println (PATH);
	
	Properties properties = new Properties()
	File propertiesFile = new File("${workspace}/test.properties")
	properties.load(propertiesFile.newDataInputStream())
	println("the value of worker"+worker)

}
return this