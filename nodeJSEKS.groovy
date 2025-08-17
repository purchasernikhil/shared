def call(Map configMap){
    def component = configMap.get("component")
    echo component is "$component"
    pipeline {
        agent {node { label 'AGENT-1'}}
        stages {
            stage ('print') {
                script{
                    echo "  "
                }
            }
        }
    }
}