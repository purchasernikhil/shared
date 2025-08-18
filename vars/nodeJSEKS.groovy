def call(Map configMap) {
    def component = configMap.get("component")
    echo "Component is ${component}"

    stage('Print') {
        echo "Hello from ${component}"
    }
}
