
def deployToCloudHub(String JarName){
	
	String PATH= "/devops/out/CDScript/working/"+JarName
	println (PATH);
	
	Properties properties = new Properties()
	File propertiesFile = new File("${workspace}/JenkinsPipelines/test.properties")
	properties.load(propertiesFile.newDataInputStream())
	println("the value of worker"+properties.worker)

	if(env.DeploymentType == "FirstRun")
	{
		println("first time deploymnent")
	}
	else{
		println("general deploymnent")
	}

}
return this