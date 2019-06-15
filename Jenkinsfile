pipeline{
	agent any
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
				def jarname="xyz.jar"
				def deploy= load "JenkinsPipelines/DeployCloudHub.groovy"
					deploy.deployToCloudHub($jarname)		
				}
			}
		}	
		}

}
