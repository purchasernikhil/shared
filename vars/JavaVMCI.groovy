def call(Map configMap) {
    def component = configMap.get("component")
    echo "Running Java VM pipeline for ${component}"

    stage('Print') {
        echo "Hello from Java VM - ${component}"
    }
}
