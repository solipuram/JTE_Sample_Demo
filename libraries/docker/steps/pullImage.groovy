void call()
{
	stage("Docker:Pull")
	{
		println"Pull  a Container from Docker Hub"
        
        echo "docker login -u ${config.login.DOCKER_USERNAME} -p ${config.login.DOCKER_PASSWORD} "
        sh "docker login -u  ${config.login.DOCKER_USERNAME} -p ${config.login.DOCKER_PASSWORD}"   
        echo "docker pull ${config.registry.url}/${config.registry.repository}:latest"
        sh  "docker pull ${config.registry.url}/${config.registry.repository}:latest"
        sh "docker images"
    }
}

