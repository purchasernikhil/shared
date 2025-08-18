def call(Map configMap) {
    def component = configMap.get("component")
    echo "Running NodeJS VM pipeline for ${component}"

    stage('Print') {
        echo "Hello from NodeJS VM - ${component}"
    }
}
