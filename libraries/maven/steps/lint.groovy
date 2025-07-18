void call () {
   println("################# STARTED LINTING FOR MAVEN APPLICATION #####################")
  sh "mvn checkstyle:checkstyle"
}
