def call(Map configMap) {
    def component = configMap.get("component")
    echo "Running Java EKS pipeline for ${component}"

    stage('Print') {
        echo "Hello from Java EKS - ${component}"
    }
}
