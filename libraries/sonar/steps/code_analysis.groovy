void call () {
    println("####### STARTED SONARQUBE ANALYISIS ##############")
    if(pipelineConfig.SONAR_PROJECT_KEY != null) {
      withSonarQubeEnv('SonarQubeServer') {
        def SONAR_SCANNER_HOME = tool 'SonarScanner' 
        sh "${SONAR_SCANNER_HOME}/bin/sonar-scanner -Dsonar.projectKey=${pipelineConfig.SONAR_PROJECT_KEY}"
        println("####### COMPLETED SONARQUBE ANALYISIS ##############")

      }
    } else {
      error("Please add SONAR_PROJECT_KEY variable in pipeline_config.groovy file.")
    }
}
  
