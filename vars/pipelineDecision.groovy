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
            echo "application is Java  and VM"
            JavaVMCI(configMap)
            break

        case 'JavaEKS':
            echo "application is Java and EKS"
            JavaEKS(configMap)
            break

        default:
            error "Unrecognised application: ${application}"
    }
}
