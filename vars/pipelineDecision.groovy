def decidePipeline(Map configMap) {
    def application = configMap.get("application")

    switch(application) {
        case 'nodeJSVMCI':
            echo "application is nodeJS and VM based"
            nodeJSVMCI(configMap)
            break

        case 'nodeJSEKS':   
            echo "application is nodeJS and EKS"
            nodeJSEKS(configMap)
            break

        case 'JavaVM':
            JavaVMCI(configMap)
            break

        case 'JavaEKS':
            JavaEKS(configMap)
            break

        default:
            error "Unrecognised application: ${application}"
    }
}
