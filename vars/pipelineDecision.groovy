def decidePipeline(Map configMap){
    application = configMap.get("application")
    switch(application) {
        case 'nodeJSVM':
            echo "application is nodeJS and vm based"
            nodeJSVMCI(configMap)
            break
        case 'nodeJSEKS'
            echo "application is nodeJS and EKS"
            nodeJSEKS(configMap)
            break
        case 'JavaVM'
            JavaVMCI(configMap)
            break 
        case 'JavaEKS'
            JavaEKS(configMap)
            break 
        default:
            error "unrecognised application"
            break 

    }
}