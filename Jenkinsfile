pipeline{
	agent any
	parameters {
		choice(name:'DeploymentType',choices: 'FirstRun\nGeneralRun')
	}
	stages{
		stage('first'){
			steps{
				echo "first stage"
			}
		}	
		stage('second'){
			steps{
				script{
				def common =load "JenkinsPipelines/Common.groovy"
					common.testMethod()
				def jarname="sampleproject-1.2.0-Example1-master-mule-application_e436f38.jar"
				def deploy= load "JenkinsPipelines/DeployCloudHub.groovy"
					deploy.deployToCloudHub(jarname)		
				}
			}
		}	
		}

}
