def deployToCloudHub(String JarName){
	
	String PATH= "/devops/out/CDScript/working/"+JarName
	println (PATH);
	
	Properties properties = new Properties()
	File propertiesFile = new File('JenkinsPipelines/test.properties')
	propertiesFile.withInputStream {
    		properties.load(it)
	}
	println("the value of worker"+worker)

}
return this
