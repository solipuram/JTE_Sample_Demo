void call()
{
	stage("Docker:Build")
	{
		println"Docker Build Method"
        sh "docker -v"
        sh "docker build -t ${config.image.name} ${config.image.dir}"

        docker_image_tagging()
        pushImage()

        //sh "docker images"
        // sh "docker rmi ${config.image.name}"
        // sh "docker images"

        
	}



}

void docker_image_tagging()
{
    echo "Image tagging method is called"
    
    echo "docker tag ${config.image.name}:latest ${config.registry.url}/${config.registry.repository}/${config.image.name}:latest"
    sh "docker tag ${config.image.name}:latest ${config.registry.url}/${config.registry.repository}/${config.image.name}:latest"
    
    sh "docker images"
}

void pushImage()
{
    echo "docker login -u ${config.login.DOCKER_USERNAME} -p ${config.login.DOCKER_PASSWORD} "
    sh "docker login -u  ${config.login.DOCKER_USERNAME} -p ${config.login.DOCKER_PASSWORD}"   
    echo "docker push ${config.registry.url}/${config.registry.repository}/${config.image.name}:latest"
    sh  "docker push ${config.registry.url}/${config.registry.repository}/${config.image.name}:latest"
 
 }