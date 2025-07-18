void call() {
   withCredentials([usernamePassword(credentialsId: "${pipelineConfig.TOMCAT_CREDENTIALS}", usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]){
        sh """
            curl -u ${USERNAME}:${PASSWORD} --upload-file ${pipelineConfig.WAR-FILE-PATH} "http://${pipelineConfig.SERVER_IP_WITH_PORT}/manager/text/deploy?path=/maven-web-application&update=true"
       """
    }
}
  
