
def deployToCloudHub(String JarName){
	
	String PATH= "/Users/snjy/Desktop/JenkinsPipelines"+JarName
	println (PATH);
	
	Properties properties = new Properties()
	File propertiesFile = new File("${workspace}/JenkinsPipelines/test.properties")
	properties.load(propertiesFile.newDataInputStream())
	println("the value of worker"+properties.worker)

	if(env.DeploymentType == "FirstRun")
	{
		withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId:'ANYPOINT', usernameVariable: 'Username', passwordVariable: 'Password']]) {
                   // jarName=sh (script : 'ls /devops/out/CDScript/working/${BUILD_NUMBER}_${JOB_NAME}/',returnStdout:true)
                    println "jar name ${JarName}"
                    sh """anypoint-cli --username ${Username} --password ${Password} runtime-mgr cloudhub-application deploy --runtime properties.runtime --workers properties.worker --workerSize properties.workerSize --region properties.region --property "username:${Username}" "muleappfirstproject" ${PATH} """
                }
	}
	else{
		println("general deploymnent")
	}

}
return this
