def call(Map configMap) {
    def component = configMap.get("component")
    echo "component is $component"

    pipeline {
        agent any
        stages {
            stage('print') {
                steps {
                    echo "Hello from $component"
                }
            }
        }
    }
}
