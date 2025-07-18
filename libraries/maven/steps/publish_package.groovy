void call () {
  println("################### STARED PUBLILSHING ARTIFACTS INTO NEXUS ############################")
  sh "mvn deploy"
}
