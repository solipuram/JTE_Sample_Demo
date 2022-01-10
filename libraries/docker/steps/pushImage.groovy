void call()
{
	stage("Docker:Push Method")
	{
		println"Docker Push Method"
        
        echo "docker login -u ${config.login.DOCKER_USERNAME} -p ${config.login.DOCKER_PASSWORD} "
        sh "docker login -u  ${config.login.DOCKER_USERNAME} -p ${config.login.DOCKER_PASSWORD}"   
        echo "docker push ${config.registry.url}/${config.registry.repository}:latest"
        sh  "docker push ${config.registry.url}/${config.registry.repository}:latest"
    }
}

