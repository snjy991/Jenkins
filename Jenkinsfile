
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
				}
			}
		}	
		}

